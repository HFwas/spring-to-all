package com.hfwas;

import com.hfwas.impl.MyMathCalculator;
import com.hfwas.inter.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @ClassName AOPTest
 * @Description
 * @Author hfwas
 * @Date:2021/10/5 2:42 下午
 * @Version: 1.0
 **/
public class AOPTest {
    private static final ApplicationContext APPLICATION_CONTEXT = new ClassPathXmlApplicationContext("applicationContext.xml");

    public static void main(String[] args) {

    }

    /*基于springaop测试*/
    @Test
    public void test02(){
        Calculator bean = APPLICATION_CONTEXT.getBean(Calculator.class);
        bean.add(10,23);

        //1、从ioc容器中拿到目标对象；注意：如果想要用类型，一定用 他的接口类型，不要用它本类
        //细节一：com.hfwas.impl.MyMathCalculator@55b53d44
        //class com.sun.proxy.$Proxy18
        //AOP的底层就是动态代理，容器中保存的组件是他的代理对象；$Proxy18。当然不是本类的类型
        System.out.println(bean);
        System.out.println(bean.getClass());
    }

    /**
     * 有了动态代理，日志记录可以做的非常强大；而且与业务逻辑解耦
     * jdk默认的动态代理，如果目标对象没有实现任何接口，是无法为他创建代理对象的；
     */
    @Test
    public void test01(){
        Calculator calculator = new MyMathCalculator();
        calculator.add(1, 2);

        calculator.div(2, 1);

        System.out.println("[==========]");

        //如果是拿到了这个对象的代理对象；代理对象执行加减乘除;
//        Calculator proxy = CalculatorProxy.getProxy(calculator);
        //com.sun.proxy.$Proxy2也是实现了Calculator接口
        //代理对象和被代理对象唯一能产生的关联就是实现了同一个接口
//        System.out.println(Arrays.asList(proxy.getClass().getInterfaces()));
//        proxy.add(2, 1);
//        proxy.div(2, 0);
    }
}
