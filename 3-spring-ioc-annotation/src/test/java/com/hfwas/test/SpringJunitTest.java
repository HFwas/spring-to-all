package com.hfwas.test;

import com.hfwas.config.SpringConfiguration;
import com.hfwas.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

/**
 * @Author: HFwas
 * @Date: 2021/2/4
 * @Description: com.hfwas.test
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
@ContextConfiguration(classes = {SpringConfiguration.class})
public class SpringJunitTest {

    @Autowired
    private UserService userService;

    @Autowired
    private DataSource dataSource;

    @Test
    public void test01(){
        System.out.println(dataSource);
        userService.save();
    }

}
