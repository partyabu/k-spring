package com.abucloud.service;

import com.abucloud.aspect.Perms;
import com.abucloud.service.impl.UserService;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author party-abu
 * @Date 2022/5/3 17:45
 */
@Service
public class UserServiceImpl implements UserService {

    @Perms(value = "one")
    @Override
    public void eatFruit() {
        System.out.println("eating");
    }
}
