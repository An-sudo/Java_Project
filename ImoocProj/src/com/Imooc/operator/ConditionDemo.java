package com.Imooc.operator;

public class ConditionDemo {
	public static void main(String[] args) {
		int a=11,b=7;
		//求a和b的最大值
		int max;
		if(a>b) {
			max=a;
		}else {
			max=b;
		}
		System.out.println("最大值："+max);
		max=a>b?a:b;
		System.out.println("max="+max);		
		boolean b1= a<b?(3<6):(true==false);
		System.out.println("max="+max);
	}

}
