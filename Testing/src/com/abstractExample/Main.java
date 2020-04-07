package com.abstractExample;

public class Main {
	public static void main(String[] args) {

		Dog dog = new Dog("tommy");
		dog.breathe();
		dog.eat();
		
		Parrot parrot = new Parrot("Indian Parrot");
		parrot.breathe();
		parrot.eat();
		parrot.fly();
		
		Penguin penguin = new Penguin("Emperor");
		penguin.fly();
		
	}
}
