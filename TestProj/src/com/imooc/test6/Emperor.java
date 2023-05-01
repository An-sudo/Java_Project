package com.imooc.test6;

public class Emperor {
	// 定义私有构造方法
	private Emperor() {

	}

	// 定义私有静态类对象
	private static Emperor em = null;

	// 定义公有静态方法返回类内的私有静态对象
	public static Emperor getEmperor() {
		if (em == null)
			em = new Emperor();
		return em;
	}
}
