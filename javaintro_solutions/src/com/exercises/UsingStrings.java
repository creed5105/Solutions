package com.exercises;

public class UsingStrings {

	   public static void main(String[] args) {
	      String input = "hello, jane!";
	      for (int end=1; end <= input.length(); ++end){
	         String line = input.substring(0, end);
	         if ( end%2 == 0 ){
	            line = line.toUpperCase();
	         }
	         System.out.println(line);
	      }
	   }
	}

