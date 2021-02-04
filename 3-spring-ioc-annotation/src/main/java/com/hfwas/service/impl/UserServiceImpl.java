package com.hfwas.service.impl;

import com.hfwas.dao.UserDao;
import com.hfwas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @Author: HFwas
 * @Date: 2021/2/4
 * @Description: com.hfwas.service.impl
 * @version: 1.0
 */
//<bean id="userService" class="com.hfwas.service.impl.UserServiceImpl">
//@Component("userService")
@Service("userService")
@Scope("singleton")
public class UserServiceImpl implements UserService {

    @Value("hello java")
    private String string;
    @Value("${jdbc.driver}")
    private String driver;

    //<property name="userDao" ref="userDao"></property>
    //按照数据类型从Spring容器中进行匹配的
    //@Autowired
    //是按照id值从容器中进行匹配的，但是主要此处@Qualifier要配合@Autowired一起使用
    //@Qualifier("userDao")
    //@Resource相当于@Qualifier+@Autowired
    @Resource(name = "userDao")
    private UserDao userDao;

    /*public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    @Override
    public void save() {
        System.out.println(driver);
        System.out.println(string);
        userDao.save();
    }

    @PostConstruct
    public void init(){
        System.out.println("对象的初始化方法");
    }

    @PreDestroy
    public void destory(){
        System.out.println("对象的销毁方法");
    }
}
