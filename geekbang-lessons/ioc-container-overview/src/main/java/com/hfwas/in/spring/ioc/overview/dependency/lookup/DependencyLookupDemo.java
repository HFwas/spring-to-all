package com.hfwas.in.spring.ioc.overview.dependency.lookup;

import com.hfwas.in.spring.ioc.overview.annotation.Super;
import com.hfwas.in.spring.ioc.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @ClassName DependencyLookupDemo
 * @Description
 * 依赖查找示例
 * 1. 通过名称的方式来查找
 * 2.
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 12:30 上午
 * @Version: 1.0
 **/
public class DependencyLookupDemo {

    public static void main(String[] args) {
        // 配置 xml 配置i文件
        // 启动 spring 应用上下文
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-lookup-context.xml");
        // 通过类型查找
        loopupByType(beanFactory);
        // 按照类型查找集合类型
        lookupByCollectionType(beanFactory);
        // 通过注解查找实例
        lookupByAnnotationType(beanFactory);

        // 通过名称查找：实时查找
        lookupInRealTime(beanFactory);
        // 通过名称查找：延时查找
        loopupInLazy(beanFactory);
    }

    private static void lookupByAnnotationType(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory) {
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String, User> beansOfType = (Map) listableBeanFactory.getBeansWithAnnotation(Super.class);
            System.out.println("查找标注@super所有的 user 集合对象:" + beansOfType);
        }
    }

    private static void lookupByCollectionType(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory) {
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String, User> beansOfType = listableBeanFactory.getBeansOfType(User.class);
            System.out.println("查找到所有的 user 集合对象:" + beansOfType);
        }
    }

    private static void loopupByType(BeanFactory beanFactory) {
        User bean = beanFactory.getBean(User.class);
        System.out.println("类型查找" + bean);
    }

    private static void loopupInLazy(BeanFactory beanFactory) {
        ObjectFactory<User> objectFactory = beanFactory.getBean("objectFactory", ObjectFactory.class);
        User user = objectFactory.getObject();

        System.out.println("延迟查找user" + user);
    }

    private static void lookupInRealTime(BeanFactory beanFactory) {
        User user = beanFactory.getBean("user", User.class);
        System.out.println("实时查找user" + user);
    }

}
