package com.hfwas.springredis.redis;

import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName JedisStringAPI
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 9:29 下午
 * @Version: 1.0
 **/
public class JedisStringAPI {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("101.200.178.253", 6379);

//        keys(jedis);
        getAndSet(jedis);
    }

    private static void getAndSet(Jedis jedis) {
        jedis.set("kkk", "kkkk");
        String kkk = jedis.get("kkk");
        System.out.println(kkk);
        System.out.println(jedis.keys("*"));;
        System.out.println("====");

        jedis.del("kkk");
        Set<String> keys = jedis.keys("*");
        keys.stream().forEach(System.out::println);
    }

    private static void keys(Jedis jedis) {
        // 获取所有的keys
        Set<String> keys = jedis.keys("*");
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
