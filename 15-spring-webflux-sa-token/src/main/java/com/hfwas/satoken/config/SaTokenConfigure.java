package com.hfwas.satoken.config;

import cn.dev33.satoken.reactor.filter.SaReactorFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName SaTokenConfigure
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * [Sa-Token 权限认证] 全局配置类
 * @Date: 11:07 下午
 * @Version: 1.0
 **/
@Configuration
public class SaTokenConfigure {

    /**
     * 注册 [Sa-Token全局过滤器]
     */
    @Bean
    public SaReactorFilter getSaReactorFilter() {
        return new SaReactorFilter()
                // 指定 [拦截路由]
                .addInclude("/**")
                // 指定 [放行路由]
                .addExclude("/favicon.ico")
                // 指定[认证函数]: 每次请求执行
                .setAuth(obj -> {
                    System.out.println("---------- sa全局认证");
                    // SaRouter.match("/test/test", () -> StpUtil.checkLogin());
                })
                // 指定[异常处理函数]：每次[认证函数]发生异常时执行此函数
                .setError(e -> {
                    System.out.println("---------- sa全局异常 ");
//                    return AjaxJson.getError(e.getMessage());
                    return null;
                })
                ;
    }

}
