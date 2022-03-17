package com.hfwas.main.config;

import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * @ClassName ValidatorConfig
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 3:31 上午
 * @Version: 1.0
 **/
@Configuration
public class ValidatorConfig {

    /**
     * 配置验证器
     *
     * @return validator
     */
//    @Bean
//    public Validator validator() {
//        ValidatorFactory validatorFactory = Validation.byProvider(HibernateValidator.class).configure().buildValidatorFactory();
//    }

}
