package com.hfwas.ioc.java.beans;

/**
 * @ClassName Person
 * @Description 描述人的 POJO类
 * setter / getter 方法
 * 可写方法(writable) / 可读方法(readable)
 * @Author hfwas
 * <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 5:10 下午
 * @Version: 1.0
 **/
public class Person {

    // string to string
    String name; // property


    // string to integer
    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
