package com.hcl.aspect;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect { // Aspect
	
	
	//@Before  advice  and the place we execute service methods called JP-Join Point
	// the expression we write to execute JP/methods known as PointCut
	@Before("execution(*  com.hcl.service.ShoppingCart.*())")
	public void beforeLogger(JoinPoint jp) {
		
		System.out.println(jp.getSignature());
		
		System.out.println("before logging  "+LocalDateTime.now());
		
	}

	@After("execution(*  com.hcl.service.*.addProduct(..))")
	public void afterLogger() {
		
		System.out.println("after logging  "+LocalDateTime.now());
		
	}
	
	@Pointcut("execution(* com.hcl.*.ShoppingCart.bookingStatus(..))")
	public void afterReturningPointCut() {  }
	
	
	@AfterReturning(pointcut = "afterReturningPointCut()", returning = "returnValue")
	public void afterReturning(String returnValue) {
		
		
		System.out.println("After Returning value by business method "+returnValue);
	}
	
	
	
	
}
