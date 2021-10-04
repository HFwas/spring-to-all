package com.hfwas;

import com.hfwas.annot.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: HFwas
 * @Date: 2021/2/4
 * @Description: com.hfwas.test
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-annot.xml")
public class AnnotTest {

    @Autowired
    private TargetInterface targetInterface;

    @Test
    public void test01(){
        targetInterface.save();
    }

}
