package com.Imooc.flow1;

import java.util.Scanner;

public class GuessDemo {
	private static Scanner sc;

	public static void main(String[] args) {
		
		//设置要猜测的数字
		int num=(int)(Math.random()*10+1);// 使用随机数生成1-10之间的数字。
		System.out.println(num);
		int guess;
		System.out.println("猜一个介于1-10之间的数字：");

		do {
			sc = new Scanner(System.in);
			guess=sc.nextInt();
			if(guess>num) {
				System.out.println("太大");
			}else if(guess<num){
				System.out.println("太小");
			}
		}while(guess!=num);
		System.out.println("恭喜你猜中了！");
		
		
	}
	
	
}
