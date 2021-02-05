package com.hfwas.proxy.cglib;

/**
 * @Author: HFwas
 * @Date: 2021/2/4
 * @Description: com.hfwas.proxy.jdk
 * @version: 1.0
 */
public class Advice {

    public void before(){
        System.out.println("前置增强........");
    }

    public void after(){
        System.out.println("后置增强.........");
    }
}
