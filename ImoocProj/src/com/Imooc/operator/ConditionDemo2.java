package com.Imooc.operator;
import java.util.Scanner;

public class ConditionDemo2 {
   public static void main(String[] args) {
	   //if-else条件语句
	   //只有if可以成立，只有一个else不能成立
	   //例：判断一个整数是奇数还是偶数，并将结果打印输出
	   //定义一个变量存放数据
	   //int n = 10;
	   //从键盘接收数据
	   System.out.println("请输出一个整数：");
	   Scanner s = new Scanner(System.in);
	   int n =s.nextInt();
	   if(n%2==0) {
		   System.out.println(n+"是偶数！");
	   }else {
		   System.out.println(n+"是奇数！");
		   
	   }
	   
	   
	   
   }
}
