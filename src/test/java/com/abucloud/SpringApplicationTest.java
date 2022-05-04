package com.abucloud;

import com.abucloud.service.impl.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author party-abu
 * @Date 2022/5/3 16:40
 */
public class SpringApplicationTest {

    @Test
    public void testAop() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = ac.getBean("userServiceImpl", UserService.class);
        userService.eatFruit();
    }
}
