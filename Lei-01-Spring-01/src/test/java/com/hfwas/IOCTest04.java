package com.hfwas;

import com.hfwas.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * @ClassName IOCTest04
 * @Description TODO
 * @Author hfwas
 * @Date:2021/10/4 3:59 下午
 * @Version: 1.0
 **/
public class IOCTest04 {
//    private static final ConfigurableApplicationContext APPLICATION_CONTEXT = new ClassPathXmlApplicationContext("applicationContext.xml");
//    private static final ConfigurableApplicationContext APPLICATION_CONTEXT = new ClassPathXmlApplicationContext("applicationContext02.xml");
    private static final ConfigurableApplicationContext APPLICATION_CONTEXT = new ClassPathXmlApplicationContext("applicationContext03.xml");

    public static void main(String[] args) {

    }

    /*测试spel表达式*/
    @Test
    public void test05(){
        Person person02 = APPLICATION_CONTEXT.getBean("person2", Person.class);
        System.out.println(person02);
    }

    /*基于xml的自动装配：测试bean的自动装配（自动赋值）*/
    @Test
    public void test04(){
        Person person = APPLICATION_CONTEXT.getBean("person", Person.class);
        System.out.println(person);
    }

    /*测试获取连接池*/
    @Test
    public void test03(){
        DataSource dataSource = APPLICATION_CONTEXT.getBean("dataSource", DataSource.class);
        System.out.println(dataSource);
    }

    /*
    * 测试bean的后置处理器*/
    @Test
    public void test02(){
//        Object bean = APPLICATION_CONTEXT.getBean("book01");
//        System.out.println("容器关闭了");
//        APPLICATION_CONTEXT.close();
    }

    /*单例：图书的生命周期：构造方法 -- 初始化方法 -- 销毁方法
    * 多例：获取bean(构造器 - 初始化方法) --  容器不会调用bean的销毁方法
    * 无论bean是否有初始化方法，bean的后置处理器都会动作
    * */
    @Test
    public void test01(){
        Object book01 = APPLICATION_CONTEXT.getBean("book01");
        System.out.println("容器关闭了");
        APPLICATION_CONTEXT.close();
    }
}
