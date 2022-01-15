package com.hfwas.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * @ClassName GatewayLog
 * @Description
 * @Author hfwas
 * @Date:2021/10/27 12:10 上午
 * @Version: 1.0
 **/
@Data
@EqualsAndHashCode()
@TableName("gateway_log")
public class GatewayLog {
    private static final long serialVersionUID = 1L;
    @TableId
    private Long id;
    @TableLogic
    private String delFlag;
    @TableField(
            fill = FieldFill.INSERT
    )
    private LocalDateTime createTime;
    @TableField(
            fill = FieldFill.INSERT_UPDATE
    )
    private LocalDateTime updateTime;
    @TableField(
            fill = FieldFill.INSERT
    )
    private Long createBy;
    @TableField(
            fill = FieldFill.INSERT_UPDATE
    )
    private Long updateBy;
    /**
     * 系统名称
     */
    @TableField(value ="system_name")
    private String systemName;

    /**
     * 微服务名称
     */
    @TableField(value ="service_name")
    private String serviceName;

    /**
     * 实例名称
     */
    @TableField(value ="instance_name")
    private String instanceName;

    /**
     * 链路ID
     */
    @TableField(value ="trace_id")
    private String traceId;

    /**
     * 日志级别
     */
    @TableField(value ="log_level")
    private String logLevel;

    /**
     * 日志时间
     */
    @TableField(value ="log_datetime")
    private LocalDateTime logDatetime;

    /**
     * 请求路径
     */
    @TableField(value ="url")
    private String url;

    /**
     * 请求状态
     */
    @TableField(value ="opResult")
    private String opresult;

    /**
     * 请求IP
     */
    @TableField(value ="requestIp")
    private String requestip;

    /**
     * 请求参数
     */
    @TableField(value ="parameters")
    private String parameters;

    /**
     * 请求状态
     */
    @TableField(value ="status")
    private String status;

    /**
     * 请求方法
     */
    @TableField(value ="method")
    private String method;

    /**
     * 操作系统
     */
    @TableField(value ="os")
    private String os;

    /**
     * 请求报文
     */
    @TableField(value ="requestBody")
    private String requestbody;

    /**
     * 用户名称
     */
    @TableField(value ="opName")
    private String opname;

    /**
     * 用户ID
     */
    @TableField(value ="opId")
    private String opid;

    /**
     * 消耗时间
     */
    @TableField(value ="elapsed_time")
    private int elapsedTime;

    /**
     * 扩展字段(各厂商自定义)
     */
    @TableField(value = "develop")
    private String develop;
}
