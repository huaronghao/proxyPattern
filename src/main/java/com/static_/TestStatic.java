package com.static_;

/**
 * @company: qishon
 * @author huaronghao
 * @date: 2017年02月17日 下午2:15:58 
 * @Description:测试
 */
public class TestStatic {
	
	public static void main(String[] args) {
		IDBQuery q = new DBQueryProxy(); //使用代理
		System.out.println(q.request());    //在真正使用时才创建真实对象
	}
}
