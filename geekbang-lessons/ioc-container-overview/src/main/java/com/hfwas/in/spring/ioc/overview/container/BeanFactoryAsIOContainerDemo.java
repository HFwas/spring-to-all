package com.hfwas.in.spring.ioc.overview.container;

import com.hfwas.in.spring.ioc.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * @ClassName IOContainerDemo
 * @Description
 *
 * BeanFactory {@link BeanFactory} 作为 IOC 容器示例
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 8:17 下午
 * @Version: 1.0
 **/
public class BeanFactoryAsIOContainerDemo {

    public static void main(String[] args) {
        // 创建 BeanFactory 容器
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
        // XML 配置文件 classpath 路径
        String location = "classpath:/META-INF/dependency-injection-context.xml";
        // 加载配置
        int beanDefinitionsCount = reader.loadBeanDefinitions(location);
        System.out.println("bean 定义的加载的数量：" + beanDefinitionsCount);

        // 依赖查找集合对象
        lookupCollectionByType(defaultListableBeanFactory);
    }

    private static void lookupCollectionByType(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory) {
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String, User> beansOfType = listableBeanFactory.getBeansOfType(User.class);
            System.out.println(beansOfType);
        }
    }

}
