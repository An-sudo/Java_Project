package com.Imooc.method;

public class ExchangeDemo {
	//交换方法
	public void swap(int a,int b) {
		int temp;
		System.out.println("before exchange：a="+a+",b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("after exchange：a="+a+",b="+b);
		
	}
	//方法里调用方法可以不用调用对象，但是主方法里一定要有调用对象
	public void swapTest() {
		int m=4,n=5;
		System.out.println("initialize:a="+m+",b="+n);
		swap(m,n);
		System.out.println("after exchange:a="+m+",b="+n);
		
	}
	
	public static void main(String[] args) {
		int m=4,n=5;
		ExchangeDemo exchangeDemo = new ExchangeDemo();//想要调用对象，主方法里一定要有这个语句
		exchangeDemo.swapTest();
		
	}
}
