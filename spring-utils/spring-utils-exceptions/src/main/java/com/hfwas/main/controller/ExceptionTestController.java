package com.hfwas.main.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ExceptionTestController
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 3:16 下午
 * @Version: 1.0
 **/
@Slf4j
@RestController
@RequestMapping("/exception")
public class ExceptionTestController {

    @GetMapping("/aa")
    public void test01() {

        int a = 1/ 0;

        System.out.println("test1");
    }

}
