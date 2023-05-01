package com.imooc.circus;

public class Clown extends Animal implements IAct {
	private String dress;
	
	public Clown() {
		
	}
	public Clown(String name,String age,String dress) {
		super(name,age);
		this.setDress(dress);
	}

	public String getDress() {
		return dress;
	}

	public void setDress(String dress) {
		this.dress = dress;
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "";
	}
	
	@Override
	public String  skill() {
			return "脚踩高跷，进行杂技魔术表演";
	}
	
}
