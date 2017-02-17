package com.static_;

/**
 * @company: qishon
 * @author huaronghao
 * @date: 2017年02月17日 下午2:04:15 
 * @Description:一个重量级对象，构造会比较缓慢
 */
public class DBQuery implements IDBQuery {
	
	public DBQuery() {
		try {
			Thread.sleep(1000); //可能包含数据库连接等耗时操作
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String request() {
		return "request string";
	}
}
