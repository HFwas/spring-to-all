package com.hfwas.main.vo;

import lombok.Data;

/**
 * @ClassName InfraApiErrorLogVO
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 2:58 上午
 * @Version: 1.0
 **/
@Data
public class InfraApiErrorLogVO {

    private Integer id;

    private String traceId;

    private String requestMethod;

    private String requestUrl;

}
