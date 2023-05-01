package com.Imooc.array;

import java.util.Scanner;

public class ArrayTestStuSco {
	public static void main(String[] args) {
		int sco[][]=new int[3][2];
		Scanner sc= new Scanner(System.in);
		int yuh=0,yup=1,shuh=0,shup=1;
		for(int i=1;i<4;i++) {
			for(int s=0;s<=1;s++) {
				if(s==0) {
					System.out.println("请输入第"+i+"名的语文成绩:");
					int a1=sc.nextInt();
					sco[i-1][s]=a1;
				}else {
					System.out.println("请输入第"+i+"名的数学成绩:");
					int a2=sc.nextInt();
					sco[i-1][s]=a2;
				}
			}
		}
		for(int t1=0;t1<=2;t1++) {
			for(int t2=0;t2<=1;t2++) {
				if(t2==0) {
					yuh=yuh+sco[t1][t2];
					yup=yuh/sco.length;
				}else {
					shuh=shuh+sco[t1][t2];
					shup=shuh/sco.length;
				}
			}
		}
	System.out.println("语文总成绩为："+yuh);
	System.out.println("语文平均分为："+yup);
	System.out.println("数学总成绩为："+shuh);
	System.out.println("数学平均分为："+shup);
	
	System.out.println("*****"+sco.length);
	
	}
}

