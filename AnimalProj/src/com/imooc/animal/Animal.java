package com.imooc.animal;

public class Animal {
	private String name;
	private int month;
	private String species;
	public int temp=15;
	
	
	public Animal(){
		
	}
	public Animal(String name,int month){
		setName(name);
		setMonth(month);
	}
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
	
	//吃东西
	public void eat() {
		System.out.println(this.getName()+"在吃东西");
	}
	public void eat(String name) {

		System.out.println(name+"在吃东西");
	}
	
	//重写object类中的equals
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		Animal temp=(Animal)obj;
		if(this.getName().equals(temp.getName())&&(this.getMonth()==temp.getMonth()))
				return true;
		else 
		   return false;
		
	}
	
	
	public boolean euqals(Animal animal) {
		if(animal==null)
			return false;
		if(this.getName().equals(animal.getName())&&(this.getMonth()==animal.getMonth()))
				return true;
		else 
		   return false;
		
	}
	
	
	public String toString () {
		return " 昵称："+this.getName()+" 年龄："+this.getMonth();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
