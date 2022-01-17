package com.hfwas.in.spring.bean.definition;

import com.hfwas.in.spring.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName BeanAliasDemo
 * @Description
 * bean 别名实例
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 8:52 下午
 * @Version: 1.0
 **/
public class BeanAliasDemo {

    public static void main(String[] args) {
        // 配置 xml 配置i文件
        // 启动 spring 应用上下文
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-definition-context.xml");
        // 通过别名 xiaomage-user 获取曾用名 user 的 bean
        User user = beanFactory.getBean("user", User.class);
        User xiaomage = beanFactory.getBean("xiaomage-user", User.class);
        System.out.println(xiaomage == user);
    }

}
