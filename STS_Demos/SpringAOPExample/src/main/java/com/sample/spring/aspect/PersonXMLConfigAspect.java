package com.sample.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class PersonXMLConfigAspect {

	public Object PersonAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("PersonXMLConfigAspect:: Before invoking getName() method");
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("PersonXMLConfigAspect:: After invoking getName() method. Return value="+value);
		return value;
	}
}
