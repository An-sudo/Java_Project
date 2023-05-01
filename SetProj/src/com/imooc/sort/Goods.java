package com.imooc.sort;

public class Goods implements Comparable<Goods>{

	
	private String id;
	private String name;
	private double price;

	public Goods() {

	}

	public Goods(String id, String name, double price) {
		this.setId(id);
		this.setName(name);
		this.setPrice(price);

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "商品编号：" + this.getId() + ",商品名称：" + this.getName() + ",商品价格：" + this.getPrice();
	}
	@Override
	public int compareTo(Goods o) {
		//取出商品价格
		double price1=this.getPrice();
		double price2=o.getPrice();
		int n;
		if(price2-price1<1&&price2-price1>0) {
			n=1;
			return n;
		}
		n=new Double(price2-price1).intValue();//注意当price1和price2的差小于1时，n会为0，
		return n;								//因此可以根据需求做进一步判断。
	}
}
