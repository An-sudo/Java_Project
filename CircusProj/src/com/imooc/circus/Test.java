package com.imooc.circus;

import java.util.Scanner;

public class Test {
	public void ifor1() {
		System.out.println("********欢迎来到太阳马戏团********");
		System.out.println("**********请选择表演者**********");
		System.out.println("**********   1、棕熊   **********");
		System.out.println("**********   2、狮子   **********");
		System.out.println("**********   3、猴子   **********");
		System.out.println("**********   4、鹦鹉   **********");
		System.out.println("**********   5、小丑   **********");
	}

	public void ifor2() {
		System.out.println("*******  是否继续观看(1-Yes/0-No)  *******");
	}

	public void ifor3() {
		System.out.println("******* 您输入的信息不正确，请重新输入 *******");
	}

	public static void main(String[] args) {
		Test ifo = new Test();
		Scanner sc = new Scanner(System.in);
		Bear one = new Bear("Bill", "1岁");
		Lion two = new Lion("Lain", "2岁", "灰色", "公狮");
		Monkey three = new Monkey("Tom", "1岁", "金丝猴");
		Parrot four = new Parrot("Rose", "1岁", "牡丹鹦鹉");
		Clown five = new Clown("Kahle", "5年", "身穿五彩服装，头上载着彩色的帽子，脸上画着夸张的彩妆");// 表演者，艺龄，着装
		
		while (true) {
			ifo.ifor1();
			switch (sc.nextInt()) {
			case 1:
				System.out.println(
						"表演者：" + one.getName() + "\n年龄：" + one.getAge() + "\n技能：" + one.skill() + "\n爱好：" + one.love());
				break;
			case 2:
				System.out.println("表演者：" + two.getName() + "\n年龄：" + two.getAge() + "\n性别：" + two.getSex() + "\n毛色："
						+ two.getColor() + "\n技能：" + two.skill() + "爱好：" + two.love());
				break;
			case 3:
				System.out.println("表演者：" + three.getType() + "\n年龄：" + three.getAge() + "\n品种：" + three.getType()
						+ "\n技能：" + three.skill() + "\n爱好：" + three.love());
				break;
			case 4:
				System.out.println("表演者：" + four.getName() + "\n年龄：" + four.getAge() + "\n品种：" + four.getType()
						+ "\n技能：" + four.skill() + "爱好：" + four.love());
				break;
			case 5:
				System.out.println("表演者：" + five.getName() + "\n艺龄：" + five.getAge() + "\n着装：" + five.getDress() + "技能："
						+ five.skill());
				break;
			default:
				ifo.ifor3();
				continue;
			}

			ifo.ifor2();
			int i = sc.nextInt();
			if (i == 1)
				continue;
			else if (i == 0)
				return;
			else
				ifo.ifor3();
			while (true) {
				ifo.ifor2();
				int a = sc.nextInt();
				if (a == 1)
					break;
				else if (a == 0)
					return;
				else
					continue;
			}
		}

	}
}
