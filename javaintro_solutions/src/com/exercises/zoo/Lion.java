package com.exercises.zoo;

public class Lion extends Animal {
	public Lion(String name) {
		super(name);
	}

	@Override
	public void makeSound(){
		System.out.println("ROAR!");
	}
}

