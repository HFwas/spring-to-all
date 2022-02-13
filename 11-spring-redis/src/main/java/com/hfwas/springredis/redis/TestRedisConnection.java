package com.hfwas.springredis.redis;

import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.Jedis;

/**
 * @ClassName TestRedisConnection
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 9:10 下午
 * @Version: 1.0
 **/
public class TestRedisConnection {
    public static void main(String[] args) {
        Jedis jedis = testJedisConnection();
        jedis.set("k1","v1");
        String k1 = jedis.get("k1");
        System.out.println(k1);


//        testRedisTemplate();
    }

    private static void testRedisTemplate() {
        RedisTemplate redisTemplate = new RedisTemplate();
        redisTemplate.opsForValue().set("k1","v1");
        System.out.println(redisTemplate.opsForValue().get("k1"));
    }

    private static Jedis testJedisConnection() {
        Jedis jedis = new Jedis("101.200.178.253", 6379);
        String ping = jedis.ping();
        System.out.println(ping);
        return jedis;
    }


}
