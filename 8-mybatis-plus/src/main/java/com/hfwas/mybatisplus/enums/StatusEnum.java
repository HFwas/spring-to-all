package com.hfwas.mybatisplus.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * @Author: HFwas
 * @Date: 2021/5/3
 * @Description: com.hfwas.mybatisplus.enums
 * @version: 1.0
 */
public enum StatusEnum {
    WORK(1,"上班"),
    REST(0,"休息");

    StatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @EnumValue
    private Integer code;
    private String msg;

}
