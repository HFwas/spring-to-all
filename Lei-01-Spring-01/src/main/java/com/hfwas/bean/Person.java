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
@AllArgsConstructor
@NoArgsConstructor
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
}
