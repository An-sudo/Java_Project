package com.Imooc.method;

public class ArgsDemo {
	//	求和
	public void sum(int...n) {//有很多的int型n变量
		int sum=0;
		for(int i:n) {
			sum=sum+i;
			System.out.println("sum="+sum);
		}
		
	}
	
	
	public static void main(String[] args) {
		ArgsDemo argsDemo=new ArgsDemo();
		argsDemo.sum(1);
		argsDemo.sum(1,2,3,4,5,6,7,8);
	}

}
