package com.hfwas.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
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
	public static void logStart(JoinPoint joinPoint){
		System.out.println("LogUtils【"+joinPoint.getSignature().getName()+"】方法开始执行，用的参数列表【"+Arrays.asList(joinPoint.getArgs())+"】");
	}

	@AfterReturning(value = "execution(public int com.hfwas.impl.MyMathCalculator.*(int,int))",returning = "result")
	public static void logReturn(JoinPoint joinPoint,Object result){
		System.out.println("LogUtils【"+joinPoint.getSignature().getName()+"】方法正常执行完成，计算结果是："+result);
	}

	@AfterThrowing(value = "execution(public int com.hfwas.impl.MyMathCalculator.*(int,int))",throwing = "exception")
	public static void logException(JoinPoint joinPoint,Exception exception) {
		System.out.println("LogUtils【"+joinPoint.getSignature().getName()+"】方法执行出现异常了，异常信息是："+exception+"；这个异常已经通知测试小组进行排查");
	}

	@After("execution(public int com.hfwas.impl.MyMathCalculator.*(int,int))")
	public static void logEnd(JoinPoint joinPoint) {
		System.out.println("LogUtils【"+joinPoint.getSignature().getName()+"】方法最终结束了");
	}

//	@Around("execution(public int com.hfwas.impl.MyMathCalculator.*(int,int))")
//	public Object logAround(ProceedingJoinPoint joinPoint){
//		Object[] args = joinPoint.getArgs();
//		Object proceed = null;
//		try {
//
//			//就是利用反射调用目标方法即可，
//			//前置通知
//			//接口返回结果
//			proceed = joinPoint.proceed(args);
//			// 后置通知
//		} catch (Throwable e) {
//			// 异常通知
//			e.printStackTrace();
//		}finally {
//			//返回通知
//		}
//
//		//反射调用的返回值一定要返回回去
//		return proceed;
//	}
}
