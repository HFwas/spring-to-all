package com.hfwas.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName Car
 * @Description TODO
 * @Author hfwas
 * @Date: 5:27 下午
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Car {
    private String carName;
    private String price;
    private String color;
}
