package com.hfwas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: HFwas
 * @Date: 2021/2/24
 * @Description: com.hfwas.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    //请求地址：http://localhost:8080/user/quick
    @RequestMapping(value = "/quick",method = RequestMethod.GET)
    public String save(){
        System.out.println("controller is runing ........");
        return "/success.jsp";
    }

}
