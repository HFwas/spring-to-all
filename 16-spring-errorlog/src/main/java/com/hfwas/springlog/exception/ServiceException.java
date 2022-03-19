package com.hfwas.springlog.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @ClassName ServiceException
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 11:42 下午
 * @Version: 1.0
 **/
@Data
@EqualsAndHashCode(callSuper = true)
public class ServiceException extends RuntimeException{

    /**
     * 业务错误码
     *
     * @see ServiceErrorCodeRange
     */
    private Integer code;
    /**
     * 错误提示
     */
    private String message;

    /**
     * 空构造方法，避免反序列化问题
     */
    public ServiceException() {
    }

    public ServiceException(ErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMsg();
    }

    public ServiceException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public ServiceException setCode(Integer code) {
        this.code = code;
        return this;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public ServiceException setMessage(String message) {
        this.message = message;
        return this;
    }

}
