package com.hcl.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {
	
	
	@Pointcut("within(com..*)")
	public void authenticatingPointCut1() {
	
	}
	
	@Pointcut("within(com..*)")
	public void  authenticatingPointCut2() {
		
		
	}
	
	@Before("authenticatingPointCut1() && authenticatingPointCut2() ")
	public void authentication() {
		
		System.out.println("Authentication request approved");
		
	}

}
