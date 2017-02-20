package com.dynamic.cglib;

import com.UserImpl;

/**
 * @company: qishon
 * @author huaronghao
 * @date: 2017年02月20日 下午3:02:20 
 * @Description:cglib动态代理测试类
 */
public class CglibProxyClient {
	
	public static void main(String[] args) {
		UserCglibProxy userCglibProxy = new UserCglibProxy();
		UserImpl userImpl = (UserImpl) userCglibProxy.getInstance(new UserImpl());
		userImpl.isAuthUser(35);
	}
}
