package com.Imooc.flow;

public class StartDemo1 {

	public static void main(String[] args) {
		int m=1;//外重循环的循环变量
		int n=1;//内重循环的循环变量
		System.out.println("输出四行四列的星号");
		while(m<=4) {
			n=1; 
			while(n<=4) {
				System.out.print("*");
				n++;
			}
			System.out.println();
			m++;
		}
		
		
		
		
		
	}

}
