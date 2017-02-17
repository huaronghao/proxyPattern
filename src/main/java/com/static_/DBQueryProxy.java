package com.static_;

/**
 * @company: qishon
 * @author huaronghao
 * @date: 2017年02月17日 下午2:09:20 
 * @Description:代理类，轻量级对象，创建很快，用于替代DBQuery的位置
 */
public class DBQueryProxy implements IDBQuery {
	
	private DBQuery real = null;
	
	@Override
	public String request() {
		//在真实需要的时候，才创建真实对象，创建过程可能很慢
		if (null == real) {
			real = new DBQuery();
		}
		//再多线程环境下，这里返回一个虚假类，类似于Future模式
		return real.request();
	}
}
