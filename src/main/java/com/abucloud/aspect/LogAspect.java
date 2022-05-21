package com.abucloud.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

// @EnableAspectJAutoProxy
// @Configuration
// @Aspect
public class LogAspect {


    @Pointcut("execution(* com.abucloud.service.*.*(..))")
    public void pointcut() {
    }
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
    }


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
