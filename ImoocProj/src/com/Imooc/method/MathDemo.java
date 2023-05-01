package com.Imooc.method;

public class MathDemo {
	//求两个int类型数的和
	public int plus(int n,int m) {
		return m+n;
	}
	//求两个double类型的和
	public double plus(double n,double m) {
		return n+m;
	}
	//求两个数组的元素的和
	public int plus(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	
	
	
	
	public static void main(String[] args) {
		int n=10,m=5;
		double n1=10,m1=20;
		int arr[]= {1,2,3,4,5,6};
		MathDemo mathDemo=new MathDemo();
		System.out.println("arr的元素的和为："+mathDemo.plus(arr));
		System.out.println("int类型的和为："+mathDemo.plus(n, m));
		System.out.println("double类型的和为："+mathDemo.plus(n1,m1));
		
		
	}

}
