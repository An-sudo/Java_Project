package com.Imooc.flow1;

public class ForDemo {
	public static void main(String[] args) {
		long n=0;
		for(;;) {
			System.out.println(+n);		
			if(n==500) {
				break;
			}
			n++;
		}
	}
}
