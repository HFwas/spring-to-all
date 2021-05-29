package com.hfwas.springboot01.config;

import com.hfwas.springboot01.bean.Car;
import com.hfwas.springboot01.bean.Pet;
import com.hfwas.springboot01.bean.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * 告诉springboot这是一个配置类 == 配置文件
 * 1.配置类里面使用@bean标注在方法上给容器注册组件，默认也是单实例的
 * 2.配置类本身也是组件
 * 3.proxyBeanMethods:代理bean的方法
 *      Full(proxyBeanMethods = true)、【保证每个@Bean方法被调用多少次返回的组件都是单实例的】
 *      Lite(proxyBeanMethods = false)【每个@Bean方法被调用多少次返回的组件都是新创建的】
 *        组件依赖必须使用Full模式默认。其他默认是否Lite模式
 */
@Import(value = {User.class,Pet.class})
@Configuration(proxyBeanMethods = true)
@ImportResource(value = "classpath:beans.xml")

//1.开启car配置绑定功能
//2.把这个car这个组件自动注册到容器中
@EnableConfigurationProperties(Car.class)

public class MyConfig {

    /**
     * Full:外部无论对配置类中的这个组件注册方法调用多少次获取的都是之前注册容器中的单实例对象
     * @return
     */
    @Bean //给容器中添加组件，以方法名作为组件的id，返回类型就是组件类型，返回的值，就是组件在容器中的实例
    public User getUser(){
        return new User("张三",15);
    }

    @Bean
    public Pet getPet(){
//        return new Pet("猪" );
        return new Pet();
    }

}
