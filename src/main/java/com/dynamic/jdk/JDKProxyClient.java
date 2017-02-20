package com.dynamic.jdk;

import com.IUser;
import com.UserImpl;

/**
 * @company: qishon
 * @author huaronghao
 * @date: 2017年02月20日 上午11:37:57 
 * @Description:JDK代理测试类
 */
public class JDKProxyClient {
	
	public static void main(String[] args) {
		UserJDKProxy userJDKProxy = new UserJDKProxy();
		IUser iUser = (IUser) userJDKProxy.initUserJDKProxy(new UserImpl());
		iUser.isAuthUser(19);
	}
}
