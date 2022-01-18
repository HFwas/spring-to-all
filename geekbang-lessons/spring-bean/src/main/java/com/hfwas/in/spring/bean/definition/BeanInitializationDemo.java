package com.hfwas.in.spring.bean.definition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName BeanInitializationDemo
 * @Description
 *
 * bean 的实例化
 *
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 10:51 下午
 * @Version: 1.0
 **/
public class BeanInitializationDemo {

    public static void main(String[] args) {
        // 创建 BeanFactory 容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // 注册 Configuration class （配置类）


        // 启动 Spring 应用上下文
        applicationContext.refresh();
        // 关闭 Spring 应用上下文
        applicationContext.close();
    }

}
