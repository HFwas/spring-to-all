package com.hfwas;

import com.hfwas.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @ClassName TXTest
 * @Description
 * @Author hfwas
 * @Date:2021/10/7 12:41 下午
 * @Version: 1.0
 **/
public class TXTest {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void test() throws SQLException {
        DataSource bean = ioc.getBean(DataSource.class);
        System.out.println(bean.getConnection());


//        BookService bookService = ioc.getBean(BookService.class);
//
//        bookService.checkout("Tom", "ISBN-001");
//
//        System.out.println("结账完成");
    }
}
