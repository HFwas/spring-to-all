package com.hfwas.in.spring.bean.definition;

import com.hfwas.in.spring.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName BeanInstantiationDemo
 * @Description
 *
 * bean 实例话演示
 *
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 12:32 上午
 * @Version: 1.0
 **/
public class BeanInstantiationDemo {

    public static void main(String[] args) {
        // 配置 xml 配置i文件
        // 启动 spring 应用上下文
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-instantiation-context.xml");
        User bean = beanFactory.getBean("user-by-static-method", User.class);
        User userByInstanceMethod = beanFactory.getBean("user-by-instance-method", User.class);
        User userByFactoryBean = beanFactory.getBean("user-by-factory-bean", User.class);
        System.out.println(bean);
        System.out.println(userByInstanceMethod);
        System.out.println(userByFactoryBean);

        System.out.println(bean == userByInstanceMethod);
        System.out.println(bean == userByFactoryBean);
    }

}
