package com.imooc.good;

public class Goods {
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

}
