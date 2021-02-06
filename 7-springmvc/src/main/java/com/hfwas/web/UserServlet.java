package com.hfwas.web;

import com.hfwas.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: HFwas
 * @Date: 2021/2/6
 * @Description: com.hfwas.web
 * @version: 1.0
 */
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = ap.getBean(UserService.class);
        userService.save();
    }
}
