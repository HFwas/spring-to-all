package com.hfwas.in.spring.bean.factory;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

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
public class DefaultUserFactory implements UserFactory, InitializingBean {

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
}
