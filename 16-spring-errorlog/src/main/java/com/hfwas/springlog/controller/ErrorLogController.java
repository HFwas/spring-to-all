package com.hfwas.springlog.controller;

import com.hfwas.springlog.result.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ErrorLogController
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 12:08 上午
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/error")
public class ErrorLogController {

    @GetMapping("/arith")
    public CommonResult eror01(){
        int a = 1 / 0;
        return CommonResult.success(null);
    }

}
