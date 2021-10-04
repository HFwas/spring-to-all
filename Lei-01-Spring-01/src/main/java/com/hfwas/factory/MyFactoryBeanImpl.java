package com.hfwas.factory;

import com.hfwas.bean.Book;
import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName MyFactoryBeanImpl
 * @Description 自定义实现bean
 * 实现了springbean的方法都是spring认识的工厂类
 *
 * 1.编写一个Springbean的实现类
 * 2.在spring配置文件里边注册
 * @Author hfwas
 * @Date:2021/10/3 3:51 下午
 * @Version: 1.0
 **/
public class MyFactoryBeanImpl implements FactoryBean<Book> {
    /*getObject:工厂方法，返回创建的对象*/
    @Override
    public Book getObject() throws Exception {
        System.out.println("自定义的工厂方法执行。。。");
        Book book = new Book();
        book.setBookName("工厂模式");
        return book;
    }

    /*getObjectType：返回创建的对象的类型
    * spring会自动调用这个方法，来确认创建的对象的类型
    * */
    @Override
    public Class<?> getObjectType() {
        return null;
    }

    /**/
    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
