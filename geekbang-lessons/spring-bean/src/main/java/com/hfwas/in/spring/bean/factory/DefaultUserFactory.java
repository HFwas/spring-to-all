package com.hfwas.in.spring.bean.factory;

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
public class DefaultUserFactory implements UserFactory{

    // 基于 @PostConstruct 注解
    @PostConstruct
    public void init(){
        System.out.println("@PostConstruct UserFactory 初始化中。。。 ");
    }

}
