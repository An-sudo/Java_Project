package com.imooc.test15;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
public class EmployeeTest {
	public static void main(String[] args) {
		Employee one =new Employee("emp001","张三",1800);
		Employee two =new Employee("emp002","李四",2500);
		Employee three =new Employee("emp003","王五",1600);
		
		List <Employee>list =new ArrayList<Employee>();
		list.add(one);
		list.add(two);
		list.add(three);
		 System.out.println("排序前：");
		 for(Employee a:list) {
			 System.out.println(a);
		 }
		 
		 System.out.println("排序后：");
		 Collections.sort(list);
		 for(Employee a:list) {
			 System.out.println(a);
		 }
	}
}
