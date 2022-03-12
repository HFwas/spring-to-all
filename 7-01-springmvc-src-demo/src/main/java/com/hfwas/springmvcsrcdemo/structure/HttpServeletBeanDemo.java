package com.hfwas.springmvcsrcdemo.structure;

import com.hfwas.springmvcsrcdemo.mapstruct.UserConvert;
import com.hfwas.springmvcsrcdemo.structure.bean.User;
import com.hfwas.springmvcsrcdemo.vo.UserVO;
import org.mapstruct.factory.Mappers;
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
//        User user = new User();
//        BeanWrapper beanWrapper = PropertyAccessorFactory.forBeanPropertyAccess(user);
//        beanWrapper.setPropertyValue("name","zhangsan");
//        System.out.println(user.getName());
//
//        PropertyValue propertyValue = new PropertyValue("name", "lisi");
//        beanWrapper.setPropertyValue(propertyValue);
//        System.out.println(user.getName());


        com.hfwas.springmvcsrcdemo.bean.User user1 = new com.hfwas.springmvcsrcdemo.bean.User();
        user1.setName("houfei");
        user1.setAge(24);
        user1.setAddress("北京");
        user1.setRealName("张三");
        user1.setRoleIdList(Arrays.asList("1","2","3"));
        UserConvert INSTANCE = Mappers.getMapper( UserConvert.class );

        UserVO userVO = INSTANCE.convertUserVO(user1);
        System.out.println(userVO);

    }
}
