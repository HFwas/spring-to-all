package com.hfwas;

import com.hfwas.domian.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author: HFwas
 * @Date: 2021/2/5
 * @Description: com.hfwas.test
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcTemplateCRUDTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testQueryCount(){
        Long aLong = jdbcTemplate.queryForObject("select count(*) from account", Long.class);
        System.out.println(aLong);
    }

    @Test
    public void testQueryOne(){
        Account account = jdbcTemplate.queryForObject("select * from account where name = ?",
                new BeanPropertyRowMapper<Account>(Account.class), "lisi");
        System.out.println(account);
    }

    @Test
    public void testQueryAll(){
        List<Account> list = jdbcTemplate.query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
        System.out.println(list);
    }

    @Test
    public void testUpdate(){
        int tom = jdbcTemplate.update("update account set money=? where name = ?", 100000, "tom");
        System.out.println(tom);
    }

    @Test
    public void testDelete(){
        int tom = jdbcTemplate.update("delete from account where name = ?", "tom");
        System.out.println(tom);
    }

}
