package com.example.demo_spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoginAspect {

    @After("execution(public void addAccount())")
    public void dotheAspectStuff(){
        System.out.println("do the aspecting");
    }
}
