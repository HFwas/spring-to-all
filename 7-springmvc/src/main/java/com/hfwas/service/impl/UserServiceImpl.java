package com.hfwas.service.impl;

import com.hfwas.dao.UserDao;
import com.hfwas.service.UserService;

/**
 * @Author: HFwas
 * @Date: 2021/2/6
 * @Description: com.hfwas.service.impl
 * @version: 1.0
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }
}
