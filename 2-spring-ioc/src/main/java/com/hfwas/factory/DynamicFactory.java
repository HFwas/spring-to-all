package com.hfwas.factory;

import com.hfwas.dao.UserDao;
import com.hfwas.dao.impl.UserDaoImpl;

/**
 * @Author: HFwas
 * @Date: 2021/2/4
 * @Description: com.hfwas.factory
 * @version: 1.0
 */
public class DynamicFactory {
    //工厂实例方法实例化bean对象
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
