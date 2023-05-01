package com.imooc.test1;

public class Test {
    public static void main(String[] args) {
		System.out.print("父类信息测试：");
	    Work one=new Work();
	    System.out.println(one.work());

		System.out.print("测试工作类信息测试：");

	    TestWork two=new TestWork(10,5);
	    two.setName("测试工作");

	    System.out.println(two.work());
		System.out.print("研发工作类信息测试：");
	    DevelopmentWork three=new DevelopmentWork(1000,10);
	    three.setName("研发工作");
	    System.out.println(three.work());
	}
}
