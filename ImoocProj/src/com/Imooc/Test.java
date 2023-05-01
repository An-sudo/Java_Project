package com.Imooc;


public class Test {
	public static void main(String[] args) {
		int i=1,j=5;
		
		for(int n=1;n<=5;n++) {
			 j--;
			 for(int m=j;m>0;m--) {
				 System.out.print("  ");	 
			 }
			i=i+2;
			for(int k=0;k<i;k++) {
				System.out.print(" *");
			}
			System.out.println("");
		 }
	}
}