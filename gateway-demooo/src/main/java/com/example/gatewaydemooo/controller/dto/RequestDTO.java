package com.example.gatewaydemooo.controller.dto;

import lombok.Data;

import java.util.List;

/**
 * @Author HFwas
 * @Date 2022/1/20 15:37
 */
@Data
public class RequestDTO<T> {
    private String code;
    private String name;
    private String elementid;
    private int compareType;
    private int displayType;
    private int displaystyle;
    private List<T> optionalList;
    private String optionalvalue;
    private int orderindex;
    private String layerconfig;
    private String comment;
}
