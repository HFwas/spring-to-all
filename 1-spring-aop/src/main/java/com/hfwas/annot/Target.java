package com.hfwas.annot;

import org.springframework.stereotype.Component;

/**
 * @Author: HFwas
 * @Date: 2021/2/4
 * @Description: com.hfwas.proxy.jdk
 * @version: 1.0
 */
@Component("target")
public class Target implements TargetInterface {
    @Override
    public void save() {
        //int num = 1 / 0;
        System.out.println("save run ing......");
    }
}
