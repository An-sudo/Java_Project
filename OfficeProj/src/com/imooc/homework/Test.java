package com.imooc.homework;

public class Test {
	public static void main(String[] args) {
		Workers sss=new Workers();
		Department de1=new Department("人事部");
		Department de2=new Department("市场部");
		Duty du1=new Duty("经理");
		Duty du2=new Duty("助理");
		Duty du3=new Duty("职员");
		Workers wo1=new Workers("张铭","S001","男",29);
		Workers wo2=new Workers("李艾爱","S002","女",21);
		Workers wo3=new Workers("孙超","S004","男",29);
		Workers wo4=new Workers("张美美","S005","女",26);
		Workers wo5=new Workers("蓝迪","S006","男",37);
		Workers wo6=new Workers("米莉","S007","女",24);
		
		System.out.println(wo1.ifor(de1,du1));
		sss.sss();
		System.out.println(wo2.ifor(de1,du2));
		sss.sss();
		System.out.println(wo3.ifor(de1,du3));
		sss.sss();
		System.out.println(wo4.ifor(de2,du3));
		sss.sss();
		System.out.println(wo5.ifor(de2,du1));
		sss.sss();
		System.out.println(wo6.ifor(de2,du3));
		sss.sss();
		de1.addDepartment(wo1);
		de1.addDepartment(wo2);
		de1.addDepartment(wo3);
		de2.addDepartment(wo4);
		de2.addDepartment(wo5);
		de2.addDepartment(wo6);
		
		System.out.println("人事部的人数为："+de1.getWorkerNum()+"\n市场部的人数为："+de2.getWorkerNum());
	}
}
