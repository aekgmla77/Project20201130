package com.yedam.collection;

public class Fruit {
	private String name;
	private int price;
	public Fruit() {
		
	}
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public boolean equals(Object obj) {
//		Object obj => Fruit 클래스로 Casting
		Fruit fruit = (Fruit) obj;
		boolean b1 = this.name.length() == fruit.name.length();
		boolean b2 = this.price == fruit.price;
		return b1 && b2;
//		return this.name.equals(fruit.name) && this.price == fruit.price; //논리적으로 동일한 개체라고 지정.
//		return super.equals(obj);
		
	}
	@Override
	public int hashCode() {
//		return super.hashCode();
		return this.name.length() + this.price;//논리적으로 동일한 개체라고 지정.
	}
	

}
