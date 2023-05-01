package com.Imooc;

public class VarDome {
	public static void main(String[] args) {
		// 定义两个整型变量x，y
		// int x=3,y=5;
		int x, y;
		x = 8;
		y = 9;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		// 关于换行问题
		System.out.print(x + "\t" + y + '\n');
		System.out.println();//可以输入新的一行，空白。   也可以用'\n' 如上行所示
		System.out.print(x + "," + y + '\n' + '\n');
		System.out.print("\'" + x + "\'");
		//定义一个汉字的字符
		char ch = '安';
		System.out.println(ch+"\n");
		
		
		//用科学计数法表示浮点型数据
		double d =1.23E1;
		float f = 1.23e5f;
		double d1 =.2;
		System.out.println(d);
		System.out.println(f);
		System.out.println(d1);
		
		
				

	}

}
