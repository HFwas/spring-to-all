package com.hfwas.in.spring.bean.factory;

import com.hfwas.in.spring.domain.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName UserFactoryBean
 * @Description
 *
 * {@link com.hfwas.in.spring.domain.User} bean 的 {@link org.springframework.beans.factory.FactoryBean} 实现
 *
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 9:52 下午
 * @Version: 1.0
 **/
public class UserFactoryBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        return User.createUser();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
