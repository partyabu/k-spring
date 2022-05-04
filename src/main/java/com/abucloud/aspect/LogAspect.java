package com.abucloud.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description:
 * @Author party-abu
 * @Date 2022/5/3 17:46
 */
@EnableAspectJAutoProxy
@Configuration
@Aspect
public class LogAspect {

    /**
     * 返回值必须为void
     */
    @Pointcut("execution(* com.abucloud.service.*.*(..))")
    public void pointcut() {
    }
/*
    @Before("pointcut()")
    public void beforeLog(JoinPoint joinPoint) {
        System.out.println("before");
    }

    @AfterReturning("pointcut()")
    public void afterLog(JoinPoint joinPoint) {
        System.out.println("after");
    }

    @After("pointcut()")
    public void eventualLog(JoinPoint joinPoint) {
        System.out.println("eventual");
    }*/

    @Around("pointcut()")
    public Object aroundLog(ProceedingJoinPoint joinPoint) {

        System.out.println("around");

        Object result = null;
        try {
            result = joinPoint.proceed(joinPoint.getArgs());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        return result;
    }
}
