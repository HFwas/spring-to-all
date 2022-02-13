package com.hfwas.springredis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestRedisController
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 10:50 下午
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/testRedis")
public class TestRedisController {
    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/redis")
    public Object testRedis() {
        redisTemplate.opsForValue().set("haha", "hahha");
        Object haha = redisTemplate.opsForValue().get("haha");
        System.out.println(haha);
        return haha;
    }

}
