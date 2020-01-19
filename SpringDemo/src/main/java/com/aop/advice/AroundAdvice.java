package com.aop.advice;

import org.aopalliance.intercept.MethodInvocation;
import org.aopalliance.intercept.MethodInterceptor;

public class AroundAdvice implements MethodInterceptor{


	public Object invoke(MethodInvocation mi) throws Throwable {
		Object obj;
		System.out.println("AroundAdvice applied before actual method="+mi.getMethod().getName());
		obj = mi.proceed();
		System.out.println("obj = "+obj);
		System.out.println("AroundAdvice applied after actual method="+mi.getMethod().getName());
	   return obj;
	}

//	@Override
//	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
