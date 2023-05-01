package com.imooc.circus;

public class Monkey extends Animal implements IAct{
	private String Type;

	public Monkey() {
		
	}
	public Monkey(String name,String age,String Type) {
		super(name,age);
		this.setType(Type);
	}
	public String getType() {
		return Type;
	}

	public void setType(String Type) {
		this.Type = Type;
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "喜欢模仿人的动作表情";
	}
	@Override
	public String skill() {
		return "骑独轮车过独木桥";
	}
	
}
