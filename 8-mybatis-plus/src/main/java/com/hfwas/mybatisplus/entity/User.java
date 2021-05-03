package com.hfwas.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.hfwas.mybatisplus.enums.StatusEnum;
import lombok.Data;

import java.util.Date;

/**
 * @Author: HFwas
 * @Date: 2021/5/3
 * @Description: com.hfwas.mybatisplus
 * @version: 1.0
 */
@Data
@TableName(value = "users")
public class User {
    @TableId(value = "id")
    private Long num;
    @TableField(value = "userid",select = false)
    private String userId;
    @TableField("department_id")
    private Integer departmentId;
    /*@TableField(exist = false)
    private String gender;*/
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    @Version
    private Integer version;
    private StatusEnum status;
}
