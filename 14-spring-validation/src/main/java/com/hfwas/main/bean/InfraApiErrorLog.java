package com.hfwas.main.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @ClassName InfraApiErrorLog
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 2:09 上午
 * @Version: 1.0
 **/
@TableName(value = "infra_api_error_log", autoResultMap = true)
@Data
public class InfraApiErrorLog {

    private Integer id;

    private String traceId;

    private Integer userId;

    private Integer userType;

    private String applicationName;

    private String requestMethod;

    private String requestUrl;

    private String requestParams;

    private String userIp;

    private String userAgent;

    private LocalDateTime exceptionTime;


}
