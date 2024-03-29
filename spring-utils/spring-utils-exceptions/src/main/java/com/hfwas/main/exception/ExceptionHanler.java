package com.hfwas.main.exception;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName ExceptionTests
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 3:09 下午
 * @Version: 1.0
 **/
@Slf4j
@RestControllerAdvice
public class ExceptionHanler {

    @ExceptionHandler(value = Exception.class)
    public void handler(HttpServletRequest req, Throwable throwable){
        // ArithmeticException: / by zero
        String message = ExceptionUtils.getMessage(throwable);

        // java.lang.ArithmeticException: / by zero
        //	at com.hfwas.main.controller.ExceptionTestController.test01(ExceptionTestController.java:23)
        //	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        //	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        //	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        //	at java.lang.reflect.Method.invoke(Method.java:498)
        //	at org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:205)
        //	at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:150)
        //	at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:117)
        //	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:895)
        //	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:808)
        //	at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87)
        //	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1067)
        //	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //	at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //	at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //	at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //	at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:227)
        //	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:162)
        //	at org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:53)
        //	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:189)
        //	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:162)
        //	at org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)
        //	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        //	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:189)
        //	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:162)
        //	at org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)
        //	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        //	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:189)
        //	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:162)
        //	at org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)
        //	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        //	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:189)
        //	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:162)
        //	at org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:197)
        //	at org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:97)
        //	at org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:540)
        //	at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:135)
        //	at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:92)
        //	at org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:78)
        //	at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:359)
        //	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:399)
        //	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:65)
        //	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:889)
        //	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1735)
        //	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49)
        //	at org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1191)
        //	at org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:659)
        //	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61)
        //	at java.lang.Thread.run(Thread.java:748)
        String stackTrace = ExceptionUtils.getStackTrace(throwable);
        // ArithmeticException: / by zero
        String rootCauseMessage = ExceptionUtils.getRootCauseMessage(throwable);
        // java.lang.ArithmeticException: / by zero
        Throwable rootCause = ExceptionUtils.getRootCause(throwable);
        // ["java.lang.Arith...", "	at com.hfwas.m...", "	at sun.reflect...", "	at sun.reflect...", "	at sun.reflect...", +47 more]
        String[] stackFrames = ExceptionUtils.getStackFrames(throwable);
        // 1
        int throwableCount = ExceptionUtils.getThrowableCount(throwable);
        //
        Throwable[] throwables = ExceptionUtils.getThrowables(throwable);


        log.info("错误日志开始打印");
    }

}
