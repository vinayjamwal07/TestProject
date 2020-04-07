package com.abstractExample;

public abstract class Bird extends Animal implements CanFly{

	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println(getName()+" is pecking" );
		
	}

	@Override
	public void breathe() {
		System.out.println("breath in ,Breath out , Repeat");
	}

	@Override
	public void fly() {
		
		System.out.println(getName()+" is flapping ites wings");
	}
	
   
    
}
