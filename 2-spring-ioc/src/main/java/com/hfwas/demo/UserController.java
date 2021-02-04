package com.hfwas.demo;

import com.hfwas.service.UserService;
import com.hfwas.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: HFwas
 * @Date: 2021/2/4
 * @Description: com.hfwas.demo
 * @version: 1.0
 */
public class UserController {
    public static void main(String[] args) {
//        UserService service = new UserServiceImpl();
//        service.save();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //UserService userService = (UserService) applicationContext.getBean("userService");
        UserService userService = applicationContext.getBean(UserService.class);
        userService.save();
    }
}
