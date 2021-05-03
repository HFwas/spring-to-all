package com.hfwas.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @Author: HFwas
 * @Date: 2021/5/3
 * @Description: com.hfwas.mybatisplus.entity
 * @version: 1.0
 */
@TableName(value = "user")
public class UserVO {
    private Float id;
    private String name;
    private Integer age;
    private String email;
}
