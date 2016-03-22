package com.exercises.zoo;

public class Snake extends Animal {
	public Snake(String name) {
		super(name);
	}

	@Override
	public void makeSound(){
		System.out.println("hssss!");
	}
}

