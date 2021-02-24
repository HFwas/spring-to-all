package com.hfwas.listener;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

/**
 * @Author: HFwas
 * @Date: 2021/2/24
 * @Description: com.hfwas.listener
 * @version: 1.0
 */
public class WebApplicationContextUtils {

    public static ApplicationContext getApplicationContext(ServletContext servletContext){
        return (ApplicationContext) servletContext.getAttribute("applicationContext");
    }

}
