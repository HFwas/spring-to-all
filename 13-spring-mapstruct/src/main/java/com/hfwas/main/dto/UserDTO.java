package com.hfwas.main.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName UserDTO
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 8:45 下午
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String name;
    private String address;
}
