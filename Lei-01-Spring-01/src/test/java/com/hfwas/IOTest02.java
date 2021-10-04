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

    @Test
    public void test06(){
//        实验6:通过继承实现bean配置信息的重用
        Person person06 = APPLICATION_CONTEXT1.getBean("person07", Person.class);
        System.out.println(person06);

        //显示报错信息为：BeanIsAbstractException: Error creating bean with name 'person06': Bean definition is abstract
        //测试abstract="true"时，抽象bean能不能获取，结论是：不能获取。
        Person person061 = APPLICATION_CONTEXT1.getBean("person06", Person.class);
        System.out.println(person061);
    }

    @Test
    public void test05(){
//        Object properties = APPLICATION_CONTEXT1.getBean("properties");

        //测试级联属性
        Person person05 = (Person) APPLICATION_CONTEXT1.getBean("person05");
        System.out.println(person05);
    }

    // 测试获取复杂类型的bean
    @Test
    public void test04(){
//        Person person03 = APPLICATION_CONTEXT1.getBean("person03", Person.class);
//        System.out.println(person03);

        Person person04 = APPLICATION_CONTEXT1.getBean("person04", Person.class);
        System.out.println(person04);
    }

    // 测试获取bean中的集合元素
    @Test
    public void test03(){
        // 使用自己创建的bean
        Person person02 = (Person) APPLICATION_CONTEXT1.getBean("person02");
        System.out.println(person02);

        // 使用外部引用
        Person person021 = APPLICATION_CONTEXT1.getBean("person02", Person.class);
        System.out.println(person021);

    }

    @Test
    public void test02(){
        Person person01 = (Person) APPLICATION_CONTEXT1.getBean("person01");
        System.out.println(person01.getCar());
    }

    // 测试使用null值，默认引用类型是就是null，基本类型是默认值
    @Test
    public void test01(){
        Person person01 = APPLICATION_CONTEXT1.getBean("person01", Person.class);

        //使用property赋值，比较结果false。使用复杂赋值，比较为true
        System.out.println(person01.getLastnName() == null);
        System.out.println(person01);

        //测试：获取内部bean
        // 显示报错：NoSuchBeanDefinitionException: No bean named 'car02' available
        Car car011 = (Car) APPLICATION_CONTEXT1.getBean("car02");
        System.out.println("内部bean:" + car011);


        //测试引用的对象和容器当中的对象是否是相同的对象
        Car car01 = (Car) APPLICATION_CONTEXT1.getBean("car01");
        Car car = person01.getCar();
        // true:说明是一致的
        System.out.println(car01 == car);
    }

}
