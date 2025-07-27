package com.fifteen.demo15.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestAspect {

    @Pointcut("execution(* com.fifteen.demo15.service.BookService.createBook(..))")
    public void namedPointcutDef(){

    }

    @Before("namedPointcutDef()")
    public void log() {
        System.out.println(" AOP called before");
    }
}
