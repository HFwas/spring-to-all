package com.hfwas.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @Author: HFwas
 * @Date: 2021/2/4
 * @Description: com.hfwas.config
 * @version: 1.0
 */
//<context:property-placeholder location="classpath:jdbc.properties"/>
@PropertySource("classpath:jdbc.properties")
public class DataSourceConfiguration {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    //优化
    @Bean("dataSource")
    public DataSource getDataSource() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(driver);;
        dataSource.setJdbcUrl(url);
        dataSource.setUser(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    //spring会将当前方法的返回值以指定名称存储到spring容器中
    //@Bean
//    public DataSource getDataSource1() throws Exception {
//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        dataSource.setDriverClass("com.mysql.jdbc.Driver");;
//        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
//        dataSource.setUser("root");
//        dataSource.setPassword("1230");
//        return dataSource;
//    }
}
