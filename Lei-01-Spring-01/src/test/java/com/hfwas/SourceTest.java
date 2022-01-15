package com.hfwas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName SourceTest
 * @Description
 * @Author hfwas
 * @Date:2021/10/7 1:44 下午
 * @Version: 1.0
 **/
public class SourceTest {
    private static ApplicationContext applicationContext = null;
    public static void main(String[] args) {
        applicationContext = new ClassPathXmlApplicationContext("io.xml");
        Object person01 = applicationContext.getBean("person01");
        System.out.println(person01);
    }
}
