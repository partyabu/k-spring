package com.abucloud.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author party-abu
 * @Date 2022/5/4 12:43
 */
@Component
public class KInitializingBean implements InitializingBean {

    @Override
    public void afterPropertiesSet() {
        System.out.println("afterPropertiesSet");
    }

}
