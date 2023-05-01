package com.imooc.test15;

import java.lang.Comparable;
public class Employee implements Comparable<Employee> {
	private String id;
	private String name;
	private double salary;
	
	public Employee() {
		
	}
	public Employee(String id,String name,double salary) {
		this.setId(id);
		this.setName(name);
		this.setSalary(salary);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		double a1=this.getSalary();
		double a2=o.getSalary();
		int n;
		if((a2-a1)<1&&(a2-a1)>0) {
			n=1;
			return n;
		}
		n=new Double(a2-a1).intValue();
		return n;
	}
	
	@Override 
	public String toString() {
		return "员工[编号："+getId()+"，姓名："+getName()+"，工资："+getSalary()+"]";
	}
	
}
