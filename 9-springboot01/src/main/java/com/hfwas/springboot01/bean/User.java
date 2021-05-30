package com.hfwas.springboot01.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private Integer age;

    /*public User() {
    }
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }*/
}
