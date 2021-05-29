package com.hfwas.springboot01.controoler;

import com.hfwas.springboot01.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private Car car;

    @GetMapping("/car")
    public Car getCar(){
        return car;
    }

    @RequestMapping("/hello")
    public String handle(){
        return "hello springboot";
    }

}
