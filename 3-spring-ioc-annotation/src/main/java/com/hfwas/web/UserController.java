package com.hfwas.web;

import com.hfwas.config.SpringConfiguration;
import com.hfwas.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author: HFwas
 * @Date: 2021/2/4
 * @Description: com.hfwas.web
 * @version: 1.0
 */
public class UserController {
    public static void main(String[] args) throws Exception {
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.save();
    }
}
