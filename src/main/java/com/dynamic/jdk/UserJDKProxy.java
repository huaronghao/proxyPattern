package com.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @company: qishon
 * @author huaronghao
 * @date: 2017年02月20日 上午11:15:02 
 * @Description:JDK动态代理类，可以将InvocationHandler接口的子类想象成一个代理的最终操作类
 * JDK动态代理依靠接口实现，如果有些类并没有实现接口，则不能使用JDK代理，这个也是缺陷
 */
public class UserJDKProxy implements InvocationHandler {
	
	/**
	 * target-需要代理的类
	 */
	private Object target;
	
	/**
	 * @Description: Instantiates  a new User jdk proxy.
	 * @author: ronghao.hua
	 * @date: 2017年02月20日 上午11:23:36
	 */
	public UserJDKProxy() {
	}
	
	/**
	 * @Description:绑定委托对象并返回一个代理类
	 * ClassLoader loader：类加载器
	 * Class<?>[] interfaces:得到全部的接口
	 * InvocationHandler h:得到InvocationHandler接口的子类实例
	 * @param target
	 * @return object
	 * @author: ronghao.hua
	 * @date: 2017年02月20日 上午11:23:36
	 */
	public Object initUserJDKProxy(Object target) {
		this.target = target;
		//可以看出这里的第二个参数是获取接口，那么也就是说我们实现代理，需要去实现接口，，在有的时候，类是没有接口的，所以这是jdk代理的一个缺陷
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	
	/**
	 * @Description:调用具体的方法
	 * @param proxy:指被代理的对象
	 * @param method:要调用的方法
	 * @param args:方法调用时所需要的参数
	 * @author huaronghao
	 * @date: 2017年02月20日 上午11:27:07
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("proxy:这里拦截处理一下事情...,如监控参数、插入日志...");
		//传入处理对象和参数
		Object object = method.invoke(target, args);
		System.out.println("proxy:这里做一些收尾工作...");
		return object;
	}
}
