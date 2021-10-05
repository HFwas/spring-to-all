package com.hfwas.dao;

import org.springframework.stereotype.Repository;

/**
 * @ClassName BookDao
 * @Description
 * @Author hfwas
 * @Date:2021/10/4 9:19 下午
 * @Version: 1.0
 **/
@Repository
public class BookDao {

    public void save(){
        System.out.println("图书已经保存了。。。");
    }

}
