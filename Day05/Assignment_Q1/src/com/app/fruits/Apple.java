package com.app.fruits;

public class Apple extends Fruit {

	public Apple() {
	}

	public Apple(String color, double weight, String name) {
		super(color, weight, name);
	}
	
	@Override
	public String taste() {
		return "sweet n sour";
	}
	
}
