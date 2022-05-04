package com.abucloud.config;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author party-abu
 * @Date 2022/5/4 12:53
 */
@Component
public class KDisposeableBean implements DisposableBean {

    @Override
    public void destroy() {
        System.out.println("DisposableBean");
    }
}
