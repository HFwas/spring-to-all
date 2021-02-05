package com.hfwas.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

/**
 * @Author: HFwas
 * @Date: 2021/2/5
 * @Description: com.hfwas.test
 * @version: 1.0
 */
public class JdbcTemplateTest {
    //测试spring去产生jdbctemplate对象
    @Test
    public void test02() throws PropertyVetoException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
        int update = jdbcTemplate.update("insert into account values(?,?)", "lisi", 3000);
        System.out.println(update);
    }

    //测试JdbcTemplate开发步骤
    @Test
    public void test01() throws PropertyVetoException {
        //创建数据源对象
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUser("root");
        dataSource.setPassword("1230");

        JdbcTemplate jdbc = new JdbcTemplate();
        //设置数据源对象，知道数据库在哪儿
        jdbc.setDataSource(dataSource);
        //执行操作
        int num = jdbc.update("insert into account values(?,?)", "tom", 5000);
        System.out.println(num);
    }
}
