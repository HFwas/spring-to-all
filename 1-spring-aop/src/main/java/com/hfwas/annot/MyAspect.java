package com.hfwas.annot;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author: HFwas
 * @Date: 2021/2/4
 * @Description: com.hfwas.aop
 * @version: 1.0
 */
@Component("myAspect")
@Aspect//标注当前类是一个切面类
public class MyAspect {

    //配置前置通知
    //@Before(value = "execution(* com.hfwas.annot.*.*(..))")
    public void before(){
        System.out.println("前置增强");
    }

    public void afterReturning(){
        System.out.println("后置增强");
    }

    //ProceedingJoinPoint:正在执行的连接点==切点
    //@Around(value = "execution(* com.hfwas.annot.*.*(..))")
    @Around("poincut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前增强。。。。。。。。");
        //切点方法
        Object proceed = pjp.proceed();
        System.out.println("环绕后增强。。。。。。。。");
        return proceed;
    }

    public void afterThrowing(){
        System.out.println("异常抛出增强");
    }

    //@After(value = "execution(* com.hfwas.annot.*.*(..))")
    @After("MyAspect.poincut()")
    public void after(){
        System.out.println("最终增强");
    }

    //定义切点表达式
    @Pointcut(value = "execution(* com.hfwas.annot.*.*(..))")
    public void poincut(){

    }
}

