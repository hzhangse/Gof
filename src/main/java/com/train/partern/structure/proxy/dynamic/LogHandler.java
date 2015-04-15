package com.train.partern.structure.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogHandler implements InvocationHandler {

	private Object targetObject;
	public Object newProxyInstance(Object targetObject){
		this.targetObject = targetObject;
		return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
		
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("start---->>>>"+method.getName());
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
		Object ret = null;
		try{
			//调用目标方法
		  ret = method.invoke(targetObject, args);
		  System.out.println("success---->>>>"+method.getName());
		}catch(Exception e){
			e.printStackTrace();
			  System.out.println("error---->>>>"+method.getName());
		}
		return ret;

	}

}
