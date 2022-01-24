package com.hfwas.in.spring.bean.definition;

import com.hfwas.in.spring.bean.factory.DefaultUserFactory;
import com.hfwas.in.spring.bean.factory.UserFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName SingletonBeanRegisterDemo
 * @Description
 *
 * 单体 bean 注册实例
 *
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 11:24 下午
 * @Version: 1.0
 **/
public class SingletonBeanRegisterDemo {

    public static void main(String[] args) {
        // 创建 BeanFactory 容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // 创建一个外部 UserFactory 对象
        UserFactory userFactory = new DefaultUserFactory();
        ConfigurableListableBeanFactory configurableListableBeanFactory = applicationContext.getBeanFactory();
        // 注册外部单例对象
        configurableListableBeanFactory.registerSingleton("userFactory", userFactory);
        // 启动 Spring 应用上下文
        applicationContext.refresh();

        // 通过依赖查找 的方式来获取 UserFactory
        UserFactory userFactoryByLookUp = configurableListableBeanFactory.getBean("userFactory", UserFactory.class);
        System.out.println("UserFactory == userFactoryByLookUp ? " + (userFactoryByLookUp == userFactory));

        // 关闭 Spring 应用上下文
        applicationContext.close();
    }

}
