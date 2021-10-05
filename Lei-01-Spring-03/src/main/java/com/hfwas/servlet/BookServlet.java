package com.hfwas.servlet;

import com.hfwas.service.BookService;
import com.hfwas.service.BookServiceExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @ClassName BookServlet
 * @Description
 * @Author hfwas
 * @Date:2021/10/4 9:20 下午
 * @Version: 1.0
 **/
@Controller
public class BookServlet {
    /*@Qualifier("")：指定一个名作为id，让Spring别使用变量名作为ID*/
    @Qualifier("bookServiceExt22")
    @Autowired(required = false)
    private BookService bookServiceExt2;

    public void doGet(){
        System.out.println("servlet正在调用service层方法。。。" + bookServiceExt2);
//        bookServiceExt2.save();
    }

}
