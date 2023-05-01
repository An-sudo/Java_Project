package com.Imooc.flow;

import java.util.Scanner;

public class WeekDemo2 {
	public static void main(String[] args) {
		System.out.println("请输入表示星期的英文单词");
		Scanner sc = new Scanner(System.in);
		String week = sc.next();
		week=week.toUpperCase();//将字符串的内容全部改为大写
		switch (week) {
		case "MONDAY":
			System.out.println("星期一");break;
		case "TUESDAY":
			System.out.println("星期二");break;
		case "WEDNESDAY":
			System.out.println("星期三");break;
		case "THURSDAY":
			System.out.println("星期四");break;
		case "FIRDAY":
			System.out.println("星期五");break;
		case "SATURDAY":
			System.out.println("星期六");break;
		case "SUNDAY":
			System.out.println("星期日");break;
		default:
			System.out.println("请输出正确的的英文单词！");
		}

	}

}
