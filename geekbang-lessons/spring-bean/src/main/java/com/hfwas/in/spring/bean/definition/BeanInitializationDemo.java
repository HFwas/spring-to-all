package com.hfwas.in.spring.bean.definition;

import com.hfwas.in.spring.bean.factory.DefaultUserFactory;
import com.hfwas.in.spring.bean.factory.UserFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

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
        System.out.println("非延迟初始化在 sprign 应用上下文启动完成后，被初始化    ");
        // 依赖查找 UserFactory
        UserFactory bean = applicationContext.getBean(UserFactory.class);
        // com.hfwas.in.spring.bean.factory.DefaultUserFactory@c8e4bb0
        System.out.println(bean);
        System.out.println("spring 上下文   准备 关闭");
        // 关闭 Spring 应用上下文
        applicationContext.close();
        System.out.println("spring 上下文已关闭");
    }

    @Bean(initMethod = "initUserFactory", destroyMethod = "doDestory")
    @Lazy(value = false)
    public UserFactory userFactory(){
        return new DefaultUserFactory();
    }

}
