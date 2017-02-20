package com;

/**
 * @company: qishon
 * @author huaronghao
 * @date: 2017年02月20日 上午9:50:54 
 * @Description:类的实现
 */
public class UserImpl implements IUser {
	
	@Override
	public boolean isAuthUser(int uid) {
		//做一些权限验证工作
		System.out.println(uid);
		return false;
	}
}
