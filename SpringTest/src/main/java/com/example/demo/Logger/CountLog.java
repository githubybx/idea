package com.example.demo.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("logger")
@Aspect
public class CountLog {
    @Pointcut("execution(public * com.example.demo.Service.stuService.getCount())")
    public void p1(){}
    @Before("p1()")
    public void beforeAdvice(){
        System.out.println("before");
    }
    @After("p1()")
    public void afterAdvice(){
        System.out.println("after");
    }
    @AfterThrowing("p1()")
    public void WrongAdvice(){
        System.out.println("wrong");
    }
    @Around("p1()")
    public Integer SurroundAdvice(ProceedingJoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        Integer proceed = 0;
        try {
            System.out.println("前置通知");
            proceed = (Integer)joinPoint.proceed(args);
            System.out.println("后置通知");
            System.out.println("around after");
        } catch (Throwable throwable) {
            System.out.println("异常通知");
            throwable.printStackTrace();
        }finally {
            System.out.println("after通知");
            return proceed;
        }
    }
    @AfterReturning("p1()")
    public void returnAdvice(){
        System.out.println("after-return");
    }
}
