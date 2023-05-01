package com.Imooc.method;


public class MaxDemo {
	public void max(float a,float b) {
		float max;
		if(a>b) {
			max=a;
		}else {
			max=b;
		}
		System.out.println("两个数"+a+"和"+b+"的最大值为："+max);
	}
	public void max1(float a,float b) {
		float sum;
		sum=a*b;
		System.out.println("两个数"+a+"和"+b+"的和为："+sum);
	}
	public static void main(String[] args) {
		MaxDemo maxDemo = new MaxDemo();
		float a=3,b=5;
		maxDemo.max1(a, b);
		
		float m=5.6f,n=6.7f;
		maxDemo.max(m, n);
		maxDemo.max(9.5f,23.5f);
		
		
		
		
		
		
		
		
	}

}
