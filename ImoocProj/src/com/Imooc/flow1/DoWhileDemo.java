package com.Imooc.flow1;

public class DoWhileDemo {
	public static void main(String[] args) {
		//求1到5的累加和
		int n =1;
		int sum=0;// 累加赋值0，累加赋值1.
		do {
			sum=sum+n;
			n++;
		}while(n<=5);
		System.out.println("1-5的累加和为："+ sum);
	}

}
