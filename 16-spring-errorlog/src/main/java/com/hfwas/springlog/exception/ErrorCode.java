package com.hfwas.springlog.exception;

import lombok.Data;

/**
 * @ClassName ErrorCode
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 11:39 下午
 * @Version: 1.0
 **/
@Data
public class ErrorCode {

    /**
     * 错误码
     */
    private final Integer code;
    /**
     * 错误提示
     */
    private final String msg;

    public ErrorCode(Integer code, String message) {
        this.code = code;
        this.msg = message;
    }

}
