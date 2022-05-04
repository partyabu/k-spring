package com.abucloud.config;

import com.abucloud.entity.StuEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author party-abu
 * @Date 2022/5/4 12:49
 */
@Configuration
public class KConfig {

    @Bean(initMethod = "initMethodOne", destroyMethod = "destroyMethodOne")
    public StuEntity initialization() {
        System.out.println("stuEntity postConstruction");
        return new StuEntity();
    }

}
