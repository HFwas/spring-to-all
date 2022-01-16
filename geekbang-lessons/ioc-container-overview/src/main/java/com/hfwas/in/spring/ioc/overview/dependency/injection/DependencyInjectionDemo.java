package com.hfwas.in.spring.ioc.overview.dependency.injection;

import com.hfwas.in.spring.ioc.overview.annotation.Super;
import com.hfwas.in.spring.ioc.overview.domain.User;
import com.hfwas.in.spring.ioc.overview.repository.UserRepository;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Map;

/**
 * @ClassName DependencyLookupDemo
 * @Description
 * 依赖注入示例
 *
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 12:30 上午
 * @Version: 1.0
 **/
public class DependencyInjectionDemo {

    public static void main(String[] args) {
        // 配置 xml 配置i文件
        // 启动 spring 应用上下文
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-injection-context.xml");

        // 依赖来源一：自定义 bean
        UserRepository userRepository = beanFactory.getBean(UserRepository.class);
        System.out.println("UserRepository: " + userRepository.getUsers());

        ObjectFactory<User> userObjectFactory = userRepository.getUserObjectFactory();
        System.out.println("ObjectFactory<User>: " + userObjectFactory.getObject());

        ObjectFactory<ApplicationContext> userObjectFactoryApplicationContext = userRepository.getUserObjectFactoryApplicationContext();
        System.out.println("ObjectFactory<ApplicationContext>: " + userObjectFactoryApplicationContext.getObject());

        // true
        // 在对象内部注入了一个ObjectFactory<ApplicationContext>对象，这个对象和外部获得的BeanFactory beanFactory是一致的
        System.out.println(userObjectFactoryApplicationContext.getObject() == beanFactory);

        // 依赖来源二：依赖注入 （内建依赖）
        System.out.println(userRepository.getBeanFactory());
        // false
        // 在对象内部注入了ObjectFactory<User>，获得的对象和在外部获得对象是不一致的。false
        System.out.println(userRepository.getBeanFactory() == beanFactory);

        // 依赖查找 （错误）
        // org.springframework.beans.factory.NoSuchBeanDefinitionException
//        System.out.println(beanFactory.getBean(BeanFactory.class));


        // 依赖来源三：容器内建bean
        Environment bean = beanFactory.getBean(Environment.class);
        System.out.println("获取 Environment 类型的bean:" + bean);
    }

}
