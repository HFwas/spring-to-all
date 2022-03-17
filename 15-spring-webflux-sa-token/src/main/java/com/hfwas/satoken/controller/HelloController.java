package com.hfwas.satoken.controller;

import cn.dev33.satoken.stp.StpUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @ClassName HelloController
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 11:05 下午
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/test/")
public class HelloController {

    // 测试登录，浏览器访问： http://localhost:8081/test/doLogin?username=zhang&password=123456
    @RequestMapping("doLogin")
    public String doLogin(String username, String password) {
        // 此处仅作模拟示例，真实项目需要从数据库中查询数据进行比对
        if("zhang".equals(username) && "123456".equals(password)) {
            StpUtil.login(10001);
            return "登录成功";
        }
        return "登录失败";
    }

    // 查询登录状态，浏览器访问： http://localhost:8081/test/isLogin
    @RequestMapping("isLogin")
    public String isLogin() {
        return "当前会话是否登录：" + StpUtil.isLogin();
    }

    @GetMapping("/hha")
    public Mono test1(){
        return Mono.just("");
    }

}
