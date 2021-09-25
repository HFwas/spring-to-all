package com.hfwas;

import java.util.Optional;

/**
 * @ClassName test
 * @Description
 * optionnal的学习，练习
 * @Author hfwas
 * @Date: 12:03 上午
 * @Version: 1.0
 **/
public class test {
    public static void main(String[] args) {
        Optional<String> n12323 = Optional.of("n12323");
        System.out.println(n12323);

        // optionnal中的of方法参数不能为空
//        Optional<String> num = Optional.of(null);
//        System.out.println(num);

        Optional<String> houfei = Optional.ofNullable("houfei");
        System.out.println(houfei);

        // ofnullable方法参数可以为空，为空时输出为Optional.empty
        Optional<Object> o = Optional.ofNullable(null);
        System.out.println(o);
    }
}
