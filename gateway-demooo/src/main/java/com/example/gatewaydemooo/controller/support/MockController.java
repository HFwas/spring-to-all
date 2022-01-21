package com.example.gatewaydemooo.controller.support;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author HFwas
 * @Date 2022/1/20 11:41
 */
@RestController
@RequestMapping("/mock")
public class MockController {

    @PostMapping("/post1")
    public String get(){
        return "";
    }

}

