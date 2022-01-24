package com.hfwas.in.spring.bean.factory;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName DefaultUserFactory
 * @Description
 *
 * 默认 {@link UserFactory} 实现
 *
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 9:43 下午
 * @Version: 1.0
 **/
public class DefaultUserFactory implements UserFactory, InitializingBean, DisposableBean {

    // 基于 @PostConstruct 注解
    @PostConstruct
    public void init(){
        System.out.println("@PostConstruct UserFactory 初始化中。。。 ");
    }

    public void initUserFactory(){
        System.out.println("自定义初始化方法 initUserFactory（）： UserFactory初始化中。。。。" );
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("自定义初始化方法 InitializingBean#afterPropertiesSet 初始化中。。。。" );
    }

    @PreDestroy
    public void preDestory() throws Exception {
        System.out.println("@@PreDestroy UserFactory 销毁中。。。 ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("@@DisposableBean#destroy  UserFactory 销毁中。。。 ");
    }

    public void doDestory() {
        System.out.println("自定义 destroy 方法  UserFactory 销毁中。。。 ");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("当前对象正在被回收");
    }
}
