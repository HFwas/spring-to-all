package com.hfwas.in.spring.bean.definition;

import com.hfwas.in.spring.bean.factory.DefaultUserFactory;
import com.hfwas.in.spring.bean.factory.UserFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName BeanInitializationDemo
 * @Description
 *
 * bean 初始化 demo
 *
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 10:51 下午
 * @Version: 1.0
 **/
@Configuration
public class BeanInitializationDemo {

    public static void main(String[] args) {
        // 创建 BeanFactory 容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // 注册 Configuration class （配置类）
        applicationContext.register(BeanInitializationDemo.class);
        // 启动 Spring 应用上下文
        applicationContext.refresh();
        // 依赖查找 UserFactory
        UserFactory bean = applicationContext.getBean(UserFactory.class);
        // 关闭 Spring 应用上下文
        applicationContext.close();
    }

    @Bean(initMethod = "initUserFactory")
    public UserFactory userFactory(){
        return new DefaultUserFactory();
    }

}
