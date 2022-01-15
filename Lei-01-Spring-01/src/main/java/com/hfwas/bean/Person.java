package com.hfwas.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @ClassName Person
 * @Description TODO
 * @Author hfwas
 * @Date: 4:32 下午
 * @Version: 1.0
 **/
@Data
@ToString
public class Person {
    private String lastnName;
    private Integer age;
    private String gender;
    private String email;

    private Car car;

    private List<Book> books;

    private Map<String,Object> maps;

    private Properties properties;

    public Person() {
        System.out.println("person bean创建了");
    }

    public Person(String lastnName, Integer age, String gender, String email, Car car, List<Book> books, Map<String, Object> maps, Properties properties) {
        this.lastnName = lastnName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.car = car;
        this.books = books;
        this.maps = maps;
        this.properties = properties;
        System.out.println("person bean创建");
    }
}
