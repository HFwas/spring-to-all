package com.hfwas.proxy.cglib;

import com.hfwas.proxy.jdk.TargetInterface;

/**
 * @Author: HFwas
 * @Date: 2021/2/4
 * @Description: com.hfwas.proxy.jdk
 * @version: 1.0
 */
public class Target implements TargetInterface {
    @Override
    public void save() {
        System.out.println("save run ing......");
    }
}
