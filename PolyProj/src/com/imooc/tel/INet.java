package com.imooc.tel;

//接口访问修饰符：public 或者 默认
public interface INet {
	/*接口中抽象方法可以不写abstract关键字默认为抽象方法
	 *访问修饰符默认public
	 *当类实现接口使，需要去实现接口中的所有抽象方法，否则需要将该类设置为抽象类 
	 * */
	//抽象方法
	void network();
	
	
	
	//接口中可以包含常量，默认public static final 
	public static final int Temp=20;
	
	
	/* default:默认方法 可以带方法体（JDK1.8后新增） 可以在实现类中重写
	 * 可以在实现类中重写，并可以通过接口的引用调用
	 * 测试类中调用：<对象名>.<方法名(接口的引用)>() 
	 * 实现类中调用：<接口名>.super.<默认方法名>()
	 **/
	default public void connection() {
		System.out.println("我是接口中默认链接");
	}
	
	/*static：静态方法 可以带方法体（JDK1.8后新增）不可以在实现类中重写
	 *不可以在实现类中重写，可以同接口名调用
	 *测试类中调用：<接口名>.<方法名>()
	 *实现类中调用：<接口名>.<方法名>()
	 * */
	static void stop() {
		System.out.println("我是接口中的静态方法");
	}
}
