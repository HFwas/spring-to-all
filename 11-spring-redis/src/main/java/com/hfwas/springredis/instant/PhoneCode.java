package com.hfwas.springredis.instant;

import redis.clients.jedis.Jedis;

import java.util.UUID;

/**
 * @ClassName PhoneCode
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 10:02 下午
 * @Version: 1.0
 **/
public class PhoneCode {
    public static void main(String[] args) {
        String code = getCode();
        System.out.println(code);
        verifyCode("123",code);
        boolean verify = verify("123", code);
        if (verify) System.out.println("通过");
    }
    // 3。 验证码的校验
    public static boolean verify(String phone , String code) {
        Jedis jedis = new Jedis("101.200.178.253", 6379);
        String vcode = jedis.get("verify:" + phone + ":" + code);
        if (vcode.equals(code)) {
            return true;
        } else {
            return false;
        }
    }

    // 1.生成一个随机的六位验证码
    public static String getCode() {
        UUID uuid = UUID.randomUUID();

        String code = uuid.toString().substring(0, 6);
        return code;
    }

    // 2。 每个手机只能发送三次，两分钟有效
    public static void verifyCode(String phone, String code) {
        Jedis jedis = new Jedis("101.200.178.253", 6379);
        // 验证码发送次数
        String countKey = "verify:" + phone + ":count";
        // 验证码是否有效
        String codeKey = "verify:" + phone + ":code";

        String count = jedis.get(countKey);
        if (!jedis.exists(countKey)) {
            jedis.setex(countKey,24*60*60, "1");
        } else if (Integer.parseInt(count) <= 2){
            jedis.incr(countKey);
        } else {
            throw new RuntimeException("每个手机只能发送三次验证码！！");
        }

        jedis.setex(codeKey, 3 * 60, code);
        jedis.close();
    }
}
