package com.abucloud.config;

import com.abucloud.entity.StuEntity;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author party-abu
 * @Date 2022/5/4 12:42
 */
@Component
public class KbeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof StuEntity){
            System.out.println("beforeBeanInitialization");
        }
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof StuEntity){
            System.out.println("afterBeanInitialization");
        }
        return null;
    }
}
