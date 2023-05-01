package com.imooc.circus;

public class Bear extends Animal implements IAct{

	public Bear() {
		
	}
	public Bear(String name,String age) {
		super(name,age);
	}
	@Override
	public String skill() {
		return "挽着花篮，打着雨伞，自立走秀";
	}

	@Override
	public void act() {
		
	}

	@Override
	public String  love() {
		return "喜欢卖萌";
	}
	
}
