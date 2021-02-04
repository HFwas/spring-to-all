package com.hfwas.demo;

import com.hfwas.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: HFwas
 * @Date: 2021/2/4
 * @Description: com.hfwas.demo
 * @version: 1.0
 */
public class UserDaoDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao user = (UserDao) context.getBean("userDao");
        user.save();
    }

}
