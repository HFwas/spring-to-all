package com.hfwas.service;

import com.hfwas.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName BookService
 * @Description
 * @Author hfwas
 * @Date:2021/10/4 9:20 下午
 * @Version: 1.0
 **/
@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public void save(){
        System.out.println("BookService正在调用dao方法");
        bookDao.save();
    }

}
