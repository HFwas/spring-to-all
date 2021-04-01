package com.hfwas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

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
    @RequestMapping(value = "/quick2")
    public ModelAndView save2(){
        /**
         * model:模型，作用封装数据
         * view:视图，作用展示数据
         */
        ModelAndView modelAndView = new ModelAndView();
        //设置视图名称
        modelAndView.setViewName("index");
        //
        return modelAndView;
    }

    //请求地址：http://localhost:8080/user/quick
    @RequestMapping(value = "/quick",method = RequestMethod.GET,params = {"username"})
    public String save(){
        System.out.println("controller is runing ........");
        //return "forward:/success.jsp";
        //return "redirect:/success.jsp";
        return "success";
    }

}
