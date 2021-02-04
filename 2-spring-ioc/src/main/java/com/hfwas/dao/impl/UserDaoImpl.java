package com.hfwas.dao.impl;

import com.hfwas.dao.UserDao;
import com.hfwas.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @Author: HFwas
 * @Date: 2021/2/4
 * @Description: com.hfwas.dao.impl
 * @version: 1.0
 */
public class UserDaoImpl implements UserDao {

    private List<String> strList;
    private Map<String, User> userMap;
    private Properties properties;

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserDaoImpl() {
        System.out.println("UserDaoImpl创建了");
    }

    @Override
    public void save() {
        //System.out.println("userName==" + name + " age== " + age);
        System.out.println(strList + "=" + userMap + "=" + properties);
        System.out.println("save run");
    }

    public void init(){
        System.out.println("初始化。。。。");
    }

    public void destory(){
        System.out.println("销毁.......");
    }
}
