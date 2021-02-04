package com.hfwas.factory;

import com.hfwas.dao.UserDao;
import com.hfwas.dao.impl.UserDaoImpl;

/**
 * @Author: HFwas
 * @Date: 2021/2/4
 * @Description: com.hfwas.factory
 * @version: 1.0
 */
public class StaticFactory {

    //工厂静态方法创建bean对象
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }

}
