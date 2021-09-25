package com.hfwas.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName Book
 * @Description TODO
 * @Author hfwas
 * @Date: 5:29 下午
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private String bookName;
    private String author;
}
