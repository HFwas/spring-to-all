package com.hfwas.dao.impl;

import com.hfwas.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Author: HFwas
 * @Date: 2021/2/4
 * @Description: com.hfwas.dao.impl
 * @version: 1.0
 */
//<bean id="userDao" class="com.hfwas.dao.impl.UserDaoImpl"></bean>
//@Component("userDao")
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("save run ing.........");
    }
}
