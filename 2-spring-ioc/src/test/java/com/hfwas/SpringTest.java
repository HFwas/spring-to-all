package com.hfwas;

import com.hfwas.dao.UserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: HFwas
 * @Date: 2021/2/4
 * @Description: com.hfwas.test
 * @version: 1.0
 */
public class SpringTest {

    //测试scope属性
    @Test
    public void TestSpring(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao user1 = (UserDao) context.getBean("userDao");
        //UserDao user2 = (UserDao) context.getBean("userDao");
        System.out.println(user1);
        //System.out.println(user2);
        context.close();
    }

    @Test
    public void testStaticFactory(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao user = (UserDao) context.getBean("userDao");
        System.out.println(user);
    }

}
