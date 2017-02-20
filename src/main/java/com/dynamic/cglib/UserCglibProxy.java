package com.dynamic.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @company: qishon
 * @author huaronghao
 * @date: 2017年02月20日 下午1:20:17 
 * @Description:采用CGLIB方式动态代理类
 */
public class UserCglibProxy implements MethodInterceptor {
	
	private Object target;
	
	public Object getInstance(Object target) {
		this.target = target;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		//回调方法
		enhancer.setCallback(this);
		//创建代理对象
		return enhancer.create();
	}
	
	//回调方法
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("可以做一些监控、预警等工作...");
		Object object = methodProxy.invokeSuper(o, objects);
		System.out.println("收尾工作...");
		return object;
	}
}
