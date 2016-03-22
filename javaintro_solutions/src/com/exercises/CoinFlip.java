package com.exercises;

import java.util.Random;

public class CoinFlip {

	public static void main(String[] args) {
		Random random = new Random();
		for (int i=0; i < 5; ++i){
			String coinflip;
			if ( random.nextBoolean() ){
				coinflip = "heads";
			} else {
				coinflip = "tails";
			}
			System.out.println(coinflip);
		}
	}
}



