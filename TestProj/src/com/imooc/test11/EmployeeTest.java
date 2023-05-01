package com.imooc.test11;

import java.util.List;
import java.util.ArrayList;

public class EmployeeTest {
	public static void main(String[] args) {
		// 定义ArrayList对象
		List list=new ArrayList();
		// 创建三个Employee类的对象
		Employee one=new Employee(001,"张三",5000);
		Employee two=new Employee(002,"李四",5500);
		Employee three=new Employee(003,"赵六",4000);
		
		// 添加员工信息到ArrayList中
		list.add(one);
		list.add(two);
		list.add(three);
		System.out.println("员工姓名   员工薪资");
		// 显示员工的姓名和薪资
		for(int i=0;i<list.size();i++) {
			System.out.println(((Employee)(list.get(i))).getName()+"      "+((Employee)(list.get(i))).getSalary());
		}
	}
}