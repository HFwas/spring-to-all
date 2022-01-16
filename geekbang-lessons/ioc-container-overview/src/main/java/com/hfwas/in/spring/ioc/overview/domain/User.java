package com.hfwas.in.spring.ioc.overview.domain;

/**
 * @ClassName User
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 12:32 上午
 * @Version: 1.0
 **/
public class User {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
