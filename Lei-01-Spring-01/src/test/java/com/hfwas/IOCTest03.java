package com.hfwas;

import com.hfwas.bean.AirPlane;
import com.hfwas.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName IOCTest03
 * @Description TODO
 * @Author hfwas
 * @Date: 5:39 下午
 * @Version: 1.0
 **/
public class IOCTest03 {
    private static final ApplicationContext APPLICATION_CONTEXT = new ClassPathXmlApplicationContext("io3.xml");


    //测试实现了factorybean接口的类的对象
    @Test
    public void test03(){
        Object factopryBean = APPLICATION_CONTEXT.getBean("factopryBean");
        //Book(bookName=工厂模式, author=null)
        System.out.println(factopryBean);
        //class com.hfwas.bean.Book
        System.out.println(factopryBean.getClass());
    }

    // 测试工厂模式创建对象
    @Test
    public void test02(){
        AirPlane airPlane = APPLICATION_CONTEXT.getBean("person03", AirPlane.class);
        System.out.println(airPlane);
    }

    @Test
    public void test01(){
//        实验八：改变bean的依赖
        System.out.println("");
    }

}
