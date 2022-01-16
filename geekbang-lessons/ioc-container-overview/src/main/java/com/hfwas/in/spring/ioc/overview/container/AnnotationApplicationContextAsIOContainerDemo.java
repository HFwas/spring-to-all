package com.hfwas.in.spring.ioc.overview.container;

import com.hfwas.in.spring.ioc.overview.domain.User;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * @ClassName IOContainerDemo
 * @Description
 *
 * 注解能力 {@link java.applet.AppletContext} 作为 IOC 容器示例
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 8:17 下午
 * @Version: 1.0
 **/
@Configuration
public class AnnotationApplicationContextAsIOContainerDemo {

    public static void main(String[] args) {
        // 创建 BeanFactory 容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // 将当前类 AnnotationApplicationContextAsIOContainerDemo 作为配置类（Configuration class）
        applicationContext.register(AnnotationApplicationContextAsIOContainerDemo.class);
        // 启动应用上下文
        applicationContext.refresh();
        // 依赖查找集合对象
        lookupCollectionByType(applicationContext);

        //
    }

    @Bean
    public User user(){
        User user = new User();
        user.setId(1212L);
        user.setName("ddd");
        return user;
    }

    private static void lookupCollectionByType(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory) {
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String, User> beansOfType = listableBeanFactory.getBeansOfType(User.class);
            System.out.println(beansOfType);
        }
    }

}
