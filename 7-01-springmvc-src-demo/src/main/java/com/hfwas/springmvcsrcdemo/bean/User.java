package com.hfwas.springmvcsrcdemo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @ClassName User
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 8:44 下午
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String address;
    private Integer age;
    private List<String> roleIdList;
    private String realName;

    // 测试类型不一致
    private String updateTime;

    // 测试字段名称不一致
    private String id;
    // dst
    private String dst;

}
