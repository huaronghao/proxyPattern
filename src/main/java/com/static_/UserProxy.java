package com.static_;

import com.IUser;
import com.UserImpl;

/**
 * @company: qishon
 * @author huaronghao
 * @date: 2017年02月20日 上午10:27:29 
 * @Description:通过代理类，实现代理接口，通过构造进行实现的代理，在每个方法里面进行日志捕获
 * 静态代理
 */
public class UserProxy implements IUser {
	
	/**
	 * userImpl-
	 */
	private UserImpl userImpl;
	
	/**
	 * @Description: Instantiates  a new User proxy.
	 * @param userImpl
	 * @author: ronghao.hua
	 * @date: 2017年02月20日 上午10:43:24
	 */
	//构造的时候直接传入代理实现类
	public UserProxy(UserImpl userImpl) {
		this.userImpl = userImpl;
	}
	
	@Override
	public boolean isAuthUser(int uid) {
		System.out.println("proxy insert msg:准备权限验证，有必要这里可以发送到MQ，做实时登录验证次数预警处理");
		boolean b = userImpl.isAuthUser(uid);
		System.out.println("proxy insert msg:验证完成，做一些清理等工作.....");
		return false;
	}
	
	/**
	 * 获取 user.
	 * @return user
	 */
	public UserImpl getUserImpl() {
		return this.userImpl;
	}
	
	/**
	 * 设置 user.
	 * @param userImpl
	 * @return user
	 */
	public UserProxy setUserImpl(UserImpl userImpl) {
		this.userImpl = userImpl;
		return this;
	}
}
