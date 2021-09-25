package com.hfwas;

import com.hfwas.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName IOCTest
 * @Description TODO
 * @Author hfwas
 * @Date: 4:38 下午
 * @Version: 1.0
 **/
public class IOCTest {
    private static final ApplicationContext APPLICATION_CONTEXT = new ClassPathXmlApplicationContext("io.xml");

    // 实验1:通过1OC容器创建对象,并为属性赋值*
    @Test
    public void testIOC(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("io.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.toString());
    }

//    实验2:根据bean的类型从IOC容器中获取bean的实例*
    @Test
    public void test02(){
        // 此时io.xml配置文件中只注册了一个bean
//        Person bean = APPLICATION_CONTEXT.getBean(Person.class);
//        System.out.println(bean);

        // 注册两个person类型的bean测试
        // 会报错。报错信息为：org.springframework.beans.factory.NoUniqueBeanDefinitionException:
//        Person bean1 = APPLICATION_CONTEXT.getBean(Person.class);
//        System.out.println(bean1);

        // 第三种方法：容器当中由多个相同类型的bean,可以指定id和对应的类型。就不会报错
        Person person02 = APPLICATION_CONTEXT.getBean("person02", Person.class);
        System.out.println(person02);
    }

//    实验3
//    通过构造器为bean的属性赋值(index, type属性介绍)
//    通过p名称空间为bean赋值
    @Test
    public void test03(){
//        Person person03 = APPLICATION_CONTEXT.getBean("person03", Person.class);
//        System.out.println(person03);

//        Person person04 = APPLICATION_CONTEXT.getBean("person04", Person.class);
//        System.out.println(person04);

        Person person05 = APPLICATION_CONTEXT.getBean("person05", Person.class);
        System.out.println(person05);
    }

//            实验4,正确的为各种属性赋值
//    测试使用nul1值、
//    引用类型赋值(引用其他bean、引用内部bean)
//    集合类型赋值(List. Map.Properties)、
//    util名称空间创建集合类型的bear
//            级联魔性赋值



}
