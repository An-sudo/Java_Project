package com.imooc.homework;

public class Department {
	private String department;
	private Workers[] arr;
	private int workerNum;
	// 无参构造
	public Department() {

	}

	// 有参构造
	public Department(String department) {
		this.setDepartment(department);
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepartment() {
		return this.department;
	}

	
	public Workers[] getArr() {
		if(this.arr==null) {
			this.arr=new Workers[20];
		}
		return arr;
	}

	public void setArr(Workers[] arr) {
		this.arr = arr;
	}

	public int getWorkerNum() {
		return workerNum;
	}

	public void setWorkerNum(int workerNum) {
		this.workerNum = workerNum;
	}
	public void addDepartment(Workers de1) {
		int i;
		for(i=0;i<this.getArr().length;i++) {
			if(this.getArr()[i]==null) {
				getArr()[i]=de1;
				break;
			}
		}
		this.workerNum=i+1;
	}
	

}
