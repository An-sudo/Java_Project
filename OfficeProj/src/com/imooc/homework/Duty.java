package com.imooc.homework;

public class Duty {
	private String duty;
	//无参构造
	public Duty() {
		
	} 
	//有参构造
	public Duty(String duty) {
		this.setDuty(duty);
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getDuty() {

		return this.duty;
	}

	public String ifor() {
		String str=this.getDuty();
		return str;
	
	}
	
}
