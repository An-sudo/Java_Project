package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoFour {
	public static void main(String[] args) {
		try {
			testAge();
		} catch (HotelAgeException e) {
			System.out.println(e.getMessage());
			System.out.println("酒店前台工作人员不允许办理入住登记");
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * throw抛出异常对象的处理方案：
	 *  1、通过try···catch包含throw语句--自己抛自己处理
	 *  2、通过throws在方法声明处抛出异常类型——谁调用谁处理--调用者可以自己处理，也可以继续上抛、
	 *     此时可以抛出与throw对象相同的类型的或者其父类
	 */
	
	// 描述酒店的入住规则：限定年龄，18岁以下，80岁以下的住客必须由亲友陪伴
	
	/*
	 * public static void main(String[] args) {
			testAge();
	 * public static void testAge() { 
	 * while (true) {
	 *  System.out.println("请输入年龄：");
	 * try {
	 *  Scanner input = new Scanner(System.in); 
	 *  int age = input.nextInt();
	 *   if(age < 18 || age > 80) {
	 * throw new Exception("18岁以下，80岁以下的住客必须由亲友陪伴"); 
	 * } else {
	 * System.out.println("欢迎入住本酒店"); 
	 * } 
	 * } catch (Exception e) {
	 *  e.printStackTrace();
	 * } 
	 * } 
	 * }
	 */
	public static void testAge() throws HotelAgeException{//也可以填Throwable，catch中也要改成Throwable
		while (true) {
			System.out.println("请输入年龄：");
			Scanner input = new Scanner(System.in);
			int age = input.nextInt();
			if (age < 18 || age > 80) {
				throw new HotelAgeException();
			} else {
				System.out.println("欢迎入住本酒店");
			}
		}
	}
}
