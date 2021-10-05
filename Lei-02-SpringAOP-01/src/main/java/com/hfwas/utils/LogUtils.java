package com.hfwas.utils;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

@Aspect
@Component
public class LogUtils {
	/**
	 * 告诉Spring每个方法都什么时候运行；
	 * try{
	 * 		@Before
	 * 		method.invoke(obj,args);
	 * 		@AfterReturning
	 * }catch(e){
	 * 		@AfterThrowing
	 * }finally{
	 * 		@After
	 * }
	 *
	 * 5个通知注解
	 * @Before：在目标方法之前运行；  					 前置通知
	 * @After：在目标方法结束之后						后置通知
	 * @AfterReturning：在目标方法正常返回之后			返回通知
	 * @AfterThrowing：在目标方法抛出异常之后运行			异常通知
	 * @Around：环绕								环绕通知
	 *
	 */
	@Before("execution(public int com.hfwas.impl.MyMathCalculator.*(int,int))")
	public static void logStart(){
		System.out.println("【"+"method.getName()"+"】方法开始执行，用的参数列表【"+"Arrays.asList(args)"+"】");
	}

	@AfterReturning("execution(public int com.hfwas.impl.MyMathCalculator.*(int,int))")
	public static void logReturn(){
		System.out.println("【"+"method.getName()"+"】方法正常执行完成，计算结果是："+"result");
	}

	@AfterThrowing("execution(public int com.hfwas.impl.MyMathCalculator.*(int,int))")
	public static void logException() {
		System.out.println("【"+"method.getName()"+"】方法执行出现异常了，异常信息是："+"e.getCause()"+"；这个异常已经通知测试小组进行排查");
	}

	@After("execution(public int com.hfwas.impl.MyMathCalculator.*(int,int))")
	public static void logEnd() {
		System.out.println("【"+"method.getName()"+"】方法最终结束了");
	}

}
