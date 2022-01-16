package com.hfwas.in.spring.ioc.overview.dependency.injection;

import com.hfwas.in.spring.ioc.overview.annotation.Super;
import com.hfwas.in.spring.ioc.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-lookup-context.xml");



    }

}
