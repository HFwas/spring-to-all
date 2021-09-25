package com.hfwas;

import com.hfwas.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName IOTest02
 * @Description
 * @Author hfwas
 * @Date: 5:34 下午
 * @Version: 1.0
 **/
public class IOTest02 {
    private static final ApplicationContext APPLICATION_CONTEXT1 = new ClassPathXmlApplicationContext("io2.xml");

    @Test
    public void test01(){
        Person person01 = APPLICATION_CONTEXT1.getBean("person01", Person.class);
        System.out.println(person01);

    }

}
