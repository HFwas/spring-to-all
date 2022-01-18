package com.hfwas.in.spring.bean.definition;

import com.hfwas.in.spring.bean.factory.DefaultUserFactory;
import com.hfwas.in.spring.bean.factory.UserFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.serviceloader.ServiceLoaderFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @ClassName SpecialBeanInstantiationDemo
 * @Description
 *
 * 特殊的 bean 实例化示例
 *
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 9:58 下午
 * @Version: 1.0
 **/
public class SpecialBeanInstantiationDemo {

    public static void main(String[] args) {
        // 配置 xml 配置文件
        // 启动 spring 应用上下文
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/META-INF/special-bean-instantiation-context.xml");
        // 通过 ApplicationContext 获取 AutowireCapableBeanFactory
        AutowireCapableBeanFactory beanFactory = applicationContext.getAutowireCapableBeanFactory();
        ServiceLoader<UserFactory> serviceLoader = beanFactory.getBean("userFactoryServiceLoader", ServiceLoader.class);
        displayServiceLoader(serviceLoader);

//         demoServiceLoader();

        // 创建 UserFactory 对象， 通过AutowireCapableBeanFactory
        UserFactory userFactory = beanFactory.createBean(DefaultUserFactory.class);
        System.out.println("AutowireCapableBeanFactory: " + userFactory.creataUser());

    }

    public static void demoServiceLoader() {
        ServiceLoader<UserFactory> serviceLoader = ServiceLoader.load(UserFactory.class, Thread.currentThread().getContextClassLoader());
        displayServiceLoader(serviceLoader);
    }

    public static void displayServiceLoader(ServiceLoader<UserFactory> serviceLoader){
        Iterator<UserFactory> iterator = serviceLoader.iterator();
        while (iterator.hasNext()) {
            UserFactory next = iterator.next();
            System.out.println(next.creataUser());
        }
    }

}
