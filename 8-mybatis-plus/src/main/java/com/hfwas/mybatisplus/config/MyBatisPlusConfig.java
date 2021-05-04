package com.hfwas.mybatisplus.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: HFwas
 * @Date: 2021/5/3
 * @Description: com.hfwas.mybatisplus.config
 * @version: 1.0
 */
@Configuration
public class MyBatisPlusConfig {

    @Bean
    public OptimisticLockerInnerInterceptor optimisticLockerInnerInterceptor(){
        return new OptimisticLockerInnerInterceptor();
    }

    /*@Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }*/

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        //MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        //mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return new MybatisPlusInterceptor();
    }

}
