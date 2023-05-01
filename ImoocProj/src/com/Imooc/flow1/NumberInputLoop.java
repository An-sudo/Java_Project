package com.Imooc.flow1;

import java.util.Scanner;

public class NumberInputLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while(true) {
			n=sc.nextInt();
			System.out.println(n);
			if(n==0) {
				break;
			}
		}
	}

}
