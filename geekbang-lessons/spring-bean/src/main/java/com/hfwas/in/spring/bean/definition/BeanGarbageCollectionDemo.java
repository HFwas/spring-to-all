package com.hfwas.in.spring.bean.definition;

import com.hfwas.in.spring.bean.factory.UserFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName BeanGarbageCollectionDemo
 * @Description
 *
 * spring bean 垃圾回收的 demo
 *
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 11:14 下午
 * @Version: 1.0
 **/
public class BeanGarbageCollectionDemo {

    public static void main(String[] args) throws InterruptedException {
        // 创建 BeanFactory 容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // 注册 Configuration class （配置类）
        applicationContext.register(BeanInitializationDemo.class);
        // 启动 Spring 应用上下文
        applicationContext.refresh();
        // 关闭 Spring 应用上下文
        applicationContext.close();

        Thread.sleep(5000L);
        // 强制执行 gc
        System.gc();
        Thread.sleep(5000L);

    }

}
