package com.exercises.zoo;

public abstract class Animal {
	
    private String name;	
	
	public Animal(String name) {
		super();
		this.name = name;
	}

	public abstract void makeSound();
	
	 public String getName() {
		return name;
	}

}
