package com.imooc.circus;

public class Parrot extends Animal implements IAct {
	private String type;
	
	public Parrot() {
		
	}
	public Parrot(String name,String age,String type) {
		super(name,age);
		this.setType(type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String love() {
		// TODO Auto-generated method stub
		return"喜欢吃坚果和松子";
	}
	@Override
	public String skill() {
		return "擅长模仿";
	}
	
	

}
