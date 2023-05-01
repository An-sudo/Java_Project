package com.imooc.sort;

public class Cat {
	private String name;
	private int month;
	private String species;
	
	//构造方法
	public Cat(String name,int month,String species) {
		this.setName(name);
		this.setMonth(month);
		this.setSpecies(species);
	}
		//getter与setter方法
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	 
	@Override
	public String toString() {
		return "名字："+this.getName()+",年龄："+this.getMonth()+",品种："+this.getSpecies();
	}
}
