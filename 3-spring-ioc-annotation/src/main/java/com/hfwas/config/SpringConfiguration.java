package com.hfwas.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @Author: HFwas
 * @Date: 2021/2/4
 * @Description: com.hfwas.config
 * 标志改类是spring的核心配置类
 * @version: 1.0
 */
@Configuration
//<context:component-scan base-package="com.hfwas"/>
@ComponentScan("com.hfwas")
//<import resource="classpath:"/>
@Import(DataSourceConfiguration.class)
public class SpringConfiguration {


}
