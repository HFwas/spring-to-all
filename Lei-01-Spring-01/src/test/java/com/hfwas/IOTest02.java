package com.hfwas;

import com.hfwas.bean.Car;
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

    // 测试使用null值，默认引用类型是就是null，基本类型是默认值
    @Test
    public void test01(){
        Person person01 = APPLICATION_CONTEXT1.getBean("person06", Person.class);

        //使用property赋值，比较结果false。使用复杂赋值，比较为true
        System.out.println(person01.getLastnName() == null);
        System.out.println(person01);

        //测试引用的对象和容器当中的对象是否是相同的对象
        Car car01 = (Car) APPLICATION_CONTEXT1.getBean("car01");
        Car car = person01.getCar();
        // true:说明是一致的
        System.out.println(car01 == car);


    }

}
