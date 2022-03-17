package com.hfwas.main.dto;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @ClassName InfraApiErrorLogDTO
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 2:57 上午
 * @Version: 1.0
 **/
@Data
public class InfraApiErrorLogDTO {

    @NotEmpty
    private Integer id;

    private String traceId;

    private Integer userId;

}
