package com.hfwas.springmvcsrcdemo.structure.bean;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @ClassName User
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 8:03 下午
 * @Version: 1.0
 **/
@Data
public class User {
    private String name;
    private Integer age;

    private LocalDateTime updateTime;
    private String address;

    private Long id;
}
