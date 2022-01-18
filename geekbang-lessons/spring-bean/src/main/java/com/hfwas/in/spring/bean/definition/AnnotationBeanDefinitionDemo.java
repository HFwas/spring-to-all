package com.hfwas.in.spring.bean.definition;

import com.hfwas.in.spring.domain.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Map;

import static org.springframework.beans.factory.support.BeanDefinitionBuilder.genericBeanDefinition;

/**
 * @ClassName AnnotationBeanDefinitionDemo
 * @Description
 *
 * 注解
 *
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 9:04 下午
 * @Version: 1.0
 **/
// 3。 通过 @Import 来进行导入
@Import(AnnotationBeanDefinitionDemo.Config.class)
public class AnnotationBeanDefinitionDemo {

    public static void main(String[] args) {
        // 创建 BeanFactory 容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // 注册 Configuration class (配置类)
        applicationContext.register(Config.class);

        // 通过 BeanDefinition 注册 API 实现
        // 1。命名 bean 的注册方式
        registerUserBeanDefinition(applicationContext, "mercyblitz-user");
        // 2. 非命名的 bean 的注册方法
        registerUserBeanDefinition(applicationContext);

        // 启动应用上下文
        applicationContext.refresh();
        // 按照类型查找
        System.out.println("Config 类型的所有的 beans : " + applicationContext.getBeansOfType(Config.class));
        System.out.println("User 类型的所有的  beans : " + applicationContext.getBeansOfType(User.class));

        // 显示地关闭Spring 应用上下文
        applicationContext.close();
    }

    /**
     * 命名 bean 的注册方式
     *
     * @param beanDefinitionRegistry
     * @param beanName
     */
    public static void registerUserBeanDefinition(BeanDefinitionRegistry beanDefinitionRegistry, String beanName) {
        BeanDefinitionBuilder beanDefinitionBuilder = genericBeanDefinition(User.class);
        beanDefinitionBuilder
                .addPropertyValue("id", 89L)
                .addPropertyValue("name", "hfwas");

        // 判断如果 beanName 参数存在时
        if (StringUtils.hasText(beanName)) {
            // 注册 BeanDefinition
            beanDefinitionRegistry.registerBeanDefinition(beanName, beanDefinitionBuilder.getBeanDefinition());
        } else {
            // 非命名的 bean 注册方法
            BeanDefinitionReaderUtils.registerWithGeneratedName(beanDefinitionBuilder.getBeanDefinition(), beanDefinitionRegistry);
        }
    }

    public static void registerUserBeanDefinition(BeanDefinitionRegistry beanDefinitionRegistry) {
        registerUserBeanDefinition(beanDefinitionRegistry, null);
    }


    // 2. 通过 @Component 方式
    @Component // 定义当前类作为 Spring bean （组件）
    public static class Config{
        // 1。 通过 @bean 方法定义
        /*通过 java 注解的方式， 定义了一个bean */
        @Bean(name = {"user", "xiaomage-user"})
        public User get(){
            User user = new User();
            user.setId(89L);
            user.setName("hfwas");
            return user;
        }
    }

}
