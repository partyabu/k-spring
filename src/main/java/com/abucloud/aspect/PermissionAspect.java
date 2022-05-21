package com.abucloud.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
@Aspect
public class PermissionAspect {


    @Before("@annotation(perms)")
    public void beforeLog(JoinPoint joinPoint, Perms perms) {
        System.out.println("before");
        System.out.println(perms.value());
    }

}
