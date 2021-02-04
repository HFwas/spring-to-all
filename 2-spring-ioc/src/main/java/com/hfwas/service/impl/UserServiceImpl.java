package com.hfwas.service.impl;

import com.hfwas.dao.UserDao;
import com.hfwas.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: HFwas
 * @Date: 2021/2/4
 * @Description: com.hfwas.service.impl
 * @version: 1.0
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    /*public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    @Override
    public void save() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao user = (UserDao) context.getBean("userDao");
        userDao.save();
    }
}
