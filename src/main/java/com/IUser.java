package com;

/**
 * @company: qishon
 * @author huaronghao
 * @date: 2017年02月20日 上午9:48:18 
 * @Description:接口类
 */
public interface IUser {
	
	/**
	 * @Description:判断用户权限
	 * @param uid
	 * @return boolean
	 * @author: ronghao.hua
	 * @date: 2017年02月20日 上午09:49:29
	 */
	public boolean isAuthUser(int uid);
}
