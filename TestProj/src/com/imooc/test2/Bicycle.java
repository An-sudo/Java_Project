package com.imooc.test2;

public class Bicycle extends NonMotor {
	public Bicycle() {
		super("捷安特","黄");
	}
    // 在构造方法中调用父类多参构造，完成属性赋值
//		NonMotor one = new NonMotor("捷安特","黄");
	// 重写运行方法，描述内容为：这是一辆**颜色的，**牌的自行车。其中**的数据由属性提供
    public String work() {
    	
    	String str="这是一辆"+getColor()+"颜色的，"+getName()+"牌的自行车";
    	return str;
    }
    
}
