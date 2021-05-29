package com.hfwas.springboot01.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 只有在容器中的组件，才会有springboot提供的强大功能
 */
//@Component
@ConfigurationProperties(prefix = "mycar")
@Data
public class Car {
    private String brand;
    private Integer price;
}
