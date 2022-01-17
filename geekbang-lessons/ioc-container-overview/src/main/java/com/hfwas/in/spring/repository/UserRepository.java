package com.hfwas.in.spring.repository;

import com.hfwas.in.spring.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;

import java.util.Collection;

/**
 * @ClassName UserRepository
 * @Description
 * 用户信息仓库
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 7:21 下午
 * @Version: 1.0
 **/
public class UserRepository {

    // 自定义 bean
    private Collection<User> users;

    // 内建非 bean 对象（依赖）
    private BeanFactory beanFactory;

    // 可以获得
    private ObjectFactory<User> userObjectFactory;

    // 对照上边的
    private ObjectFactory<ApplicationContext> userObjectFactoryApplicationContext;

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public ObjectFactory<User> getUserObjectFactory() {
        return userObjectFactory;
    }

    public void setUserObjectFactory(ObjectFactory<User> userObjectFactory) {
        this.userObjectFactory = userObjectFactory;
    }

    public ObjectFactory<ApplicationContext> getUserObjectFactoryApplicationContext() {
        return userObjectFactoryApplicationContext;
    }

    public void setUserObjectFactoryApplicationContext(ObjectFactory<ApplicationContext> userObjectFactoryApplicationContext) {
        this.userObjectFactoryApplicationContext = userObjectFactoryApplicationContext;
    }
}
