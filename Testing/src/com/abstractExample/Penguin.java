package com.abstractExample;

public class Penguin extends Bird{

	public Penguin(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		super.fly();
		System.out.println("Im not very good at that i can go for swimming");
	}

}
