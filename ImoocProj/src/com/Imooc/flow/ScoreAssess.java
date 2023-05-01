package com.Imooc.flow;

import java.util.Scanner;

public class ScoreAssess {
     public static void main(String[] args) {
    	   /*
    	    成绩大于等于90分，输出优
    	    成绩大于等于80分且小于90分，输出良
    	    成绩大于等于60分小于80分，输出中
    	    成绩小于60分，输出不及格
    	   */
    	 System.out.println("请输入成绩：");
    	 Scanner sc = new Scanner(System.in);
    	 int score = sc.nextInt();
    	 if(score>=90) 
    		 System.out.println("优");//省略了{    }
    	 	else if (score>=80)  
    	 		System.out.println("良");
    	 	else if(score>=60) 
    	 		System.out.println("中");
    	 else
    		 System.out.println("不及格");
    	   
    	   
    	 
     }
}
