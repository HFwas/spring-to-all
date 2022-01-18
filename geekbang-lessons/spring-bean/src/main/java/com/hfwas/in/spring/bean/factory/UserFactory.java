package com.hfwas.in.spring.bean.factory;

import com.hfwas.in.spring.domain.User;

/**
 * @ClassName UserFactory
 * @Description
 *
 * user 工厂类
 *
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 9:40 下午
 * @Version: 1.0
 **/
public interface UserFactory {

    default User creataUser(){
        return User.createUser();
    }

}
