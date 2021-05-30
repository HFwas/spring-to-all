package com.hfwas.springboot01.controoler;

import com.hfwas.springboot01.bean.Car;
import com.hfwas.springboot01.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {
    @Autowired
    private Car car;
    @Autowired
    private Person person;

    @GetMapping("/person")
    public Person person(){
        return person;
    }

    @GetMapping("/car")
    public Car getCar(){
        return car;
    }

    @RequestMapping("/hello")
    public String handle(){
        log.info("打印日志了。。。。");
        return "hello springboot";
    }

}
