package com.hfwas.springboot01.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    private String name;
    private Integer weight;

    /*public Pet(String name) {
        this.name = name;
    }*/
}
