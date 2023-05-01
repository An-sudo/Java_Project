package com.Imooc.method;

public class ArrayDemo {
	//定义一个用于修改摸个数组元素值的方法
	public void updateArray(int[]a) {
		a[3]=15;
		System.out.println("数组的元素为");
		for(int n:a) {
			System.out.print(n+",");
		}
	}
	public static void main(String[] args) {
		ArrayDemo arrayDemo=new ArrayDemo();
		int s[]= {3,1,5,5,8,9,3,4,4,5};
		System.out.println("方法调用前数组的元素为：");
		for(int i:s) {
			System.out.print(i+",");
		}
		System.out.println();
		arrayDemo.updateArray(s);
		System.out.println();
		System.out.println("方法调用后数组的元素：");
		for(int a:s) {
			System.out.print(a+",");
		}
		
	}
}
