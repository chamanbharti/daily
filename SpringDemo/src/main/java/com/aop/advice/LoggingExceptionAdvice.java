package com.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class LoggingExceptionAdvice implements ThrowsAdvice{

	public void afterThrowing(Exception ex) {
		System.out.println("Logging advice is applied if exception occurs, ex message ="+ex.getMessage());
	}

}
