package com.imooc.test3;

public class Test {
    public static void main(String[] args) {
       //实例化对象，传入属性值（李明, 男,18）
    	Person one=new Person("李明",18,"男");
       //打印输出对象信息
    	System.out.println(one);
    	System.out.println(one.toString());
	}
}
