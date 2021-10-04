package com.hfwas.factory;

import com.hfwas.bean.AirPlane;

/**
 * @ClassName AirPlaneInstanceFactory
 * @Description 实例工厂
 * @Author hfwas
 * @Date: 6:00 下午
 * @Version: 1.0
 **/
public class AirPlaneInstanceFactory {

    public AirPlane getAirPlane(String jzName){
        System.out.println("实例工厂再造飞机");
        AirPlane airPlane = new AirPlane();
        airPlane.setFdj("太行");
        airPlane.setFjsName(jzName);
        airPlane.setPersonNum(8989);
        airPlane.setJzName(jzName);
        airPlane.setYc("78.9m");
        return airPlane;
    }

}
