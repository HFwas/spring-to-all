package com.hfwas.springredis;

import org.junit.jupiter.api.Test;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * @ClassName StringRedis
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 11:34 下午
 * @Version: 1.0
 **/
public class StringRedis extends ApplicationTests{

    @Test
    public void test01(){
        Jedis jedis = new Jedis("101.200.178.253", 6379);
        jedis.auth("pK8aeEsM260ryincBCAYmWcBSZNJB0jx");
        jedis.set("k12","v12");
        String k12 = jedis.get("k12");
        // v12
        System.out.println(k12);
    }


}
