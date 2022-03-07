package com.hfwas.springmvcsrcdemo.structure;

import com.hfwas.springmvcsrcdemo.structure.bean.User;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Arrays;

/**
 * @ClassName HttpServeletBeanDemo
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 *
 *
 *
 * @Date: 7:51 下午
 * @Version: 1.0
 **/
public class HttpServeletBeanDemo {
    @Autowired
    private ApplicationContext applicationContext;

    class ApplicationContextDemo implements ApplicationContextAware {
        @Autowired
        private ApplicationContext applicationContext = null;


        @Override
        public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            this.applicationContext = applicationContext;
        }

    }


    public static void main(String[] args) {
        User user = new User();
        BeanWrapper beanWrapper = PropertyAccessorFactory.forBeanPropertyAccess(user);
        beanWrapper.setPropertyValue("name","zhangsan");
        System.out.println(user.getName());

        PropertyValue propertyValue = new PropertyValue("name", "lisi");
        beanWrapper.setPropertyValue(propertyValue);
        System.out.println(user.getName());

    }
}
