package com.exercises;

public class JohnsIncome {
   public static void main(String[] args) {
      double hourlyWage = 18.25;
      int numHours = (40 * 52) - (12 * 8);
      double income = hourlyWage * numHours;
      System.out.println("John makes $" + income + " per year");
   }
}


