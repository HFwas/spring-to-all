package com.hfwas.springmvcsrcdemo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @ClassName UserVO
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 8:45 下午
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {
    private String name;
    private String address;
    private Integer age;

    // 测试字段名称不一致
    private Long id;
    private String src;


    // 测试类型不一致bean对象转换
    private LocalDateTime updateTime;

}

