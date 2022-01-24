package com.example.gatewaydemooo.controller.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author HFwas
 * @Date 2022/1/19 16:39
 */
@RestController
@RequestMapping("demo")
public class HelloController {

    @GetMapping("/hello")
    public StringBuilder hello(){
        System.out.println("helllo");
        return new StringBuilder("hello gateway");
    }

}
