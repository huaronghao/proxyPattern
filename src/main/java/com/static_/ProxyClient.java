package com.static_;

import com.UserImpl;

/**
 * @company: qishon
 * @author huaronghao
 * @date: 2017年02月20日 上午10:43:51 
 * @Description:静态代理测试客户端
 */
public class ProxyClient {
	
	public static void main(String[] args) {
		UserProxy userProxy = new UserProxy(new UserImpl());
		userProxy.isAuthUser(5);
	}
}
