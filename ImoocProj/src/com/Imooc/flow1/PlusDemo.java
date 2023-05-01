package com.Imooc.flow1;

public class PlusDemo {
	public static void main(String[] args) {
		//求1-5累加和
		//1+2+3+4+5
		int n=1,sum=0;//sum是存放和的变量。	
		while(n<=5) {
			sum=sum+n;
			System.out.println(n);
			n++;
		}
		System.out.println("1-5的累加和为："+sum);
		
		//求1+3+5+7+。。。+15
		int a=1,sum1=0;
		while(a<=15) {
			sum1=sum1+a;//sum1+=n
			a=a+2;
		}
		System.out.println("1+3+5+7+~~~+15的累加和为"+sum1);
		
		
	}
}
