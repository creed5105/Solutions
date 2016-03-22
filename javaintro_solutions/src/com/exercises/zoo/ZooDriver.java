package com.exercises.zoo;

import java.util.Random;

public class ZooDriver {

	public static void main(String[] args) {
		Random random = new Random();
		Animal randomAnimal;
		for (int i=0; i < 5; ++i){
			if ( random.nextBoolean() ){
				randomAnimal = new Lion("Leo");
			} else {
				randomAnimal = new Snake("Kaa");
			}
			
			System.out.print(randomAnimal.getName() + " says ");
			randomAnimal.makeSound();
		}
	}
}
 