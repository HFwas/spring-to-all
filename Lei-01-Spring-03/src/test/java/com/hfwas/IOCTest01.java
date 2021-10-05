package com.hfwas;

import com.hfwas.service.BookService;
import com.hfwas.service.BookServiceExt;
import com.hfwas.servlet.BookServlet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName IOCTest01
 * @Description
 * @Author hfwas
 * @Date:2021/10/4 9:12 下午
 * @Version: 1.0
 **/
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class IOCTest01 {

    private static final ApplicationContext APPLICATION_CONTEXT = new ClassPathXmlApplicationContext("applicationContext.xml");
    public static void main(String[] args) {

    }

    @Test
    public void test02(){
        BookServlet bean = APPLICATION_CONTEXT.getBean(BookServlet.class);
        bean.doGet();
    }

    /*
    * 使用注解加入到容器当中的组件，和使用配置加入到容器中的组件行为都是默认一样的;
        1、组件的id。默认就是组件的类名首字母小写
        2、组件的作用域,默认就是单例的
    * */
    @Test
    public void test01(){
        Object bookDao = APPLICATION_CONTEXT.getBean("bookDao");
        Object bookDao1 = APPLICATION_CONTEXT.getBean("bookDao");
        System.out.println(bookDao == bookDao1);
    }
}
