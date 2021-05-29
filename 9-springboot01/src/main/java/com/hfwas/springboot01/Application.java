package com.hfwas.springboot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 主程序类
 * @SpringBootApplication：这是一个SpringBoot应用
 */
//@SpringBootApplication
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("com.hfwas.springboot01")
public class Application {

    public static void main(String[] args) {
        // 1.返回我们的IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        // 2.查看容器里边的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        // 如果@Configuration(proxyBeanMethods = true)代理对象调用方法。SpringBoot总会检查这个组件是否在容器中有
        // 保持组件单实例
//        User user1 = run.getBean("getUser", User.class);
//        User user2 = run.getBean("getUser", User.class);
//        //true
//        System.out.println(user1 == user2);
//
//        MyConfig myConfig = run.getBean(MyConfig.class);
//        System.out.println(myConfig);
//        User user3 = myConfig.getUser();
//        User user4 = myConfig.getUser();
//        // true
//        System.out.println(user3 == user4);

        // 查看import注解是否导入了User,Pet组件
        boolean user = run.containsBean("User");
        System.out.println(user);
        boolean pet = run.containsBean("Pet");
        System.out.println(pet);
    }

}
