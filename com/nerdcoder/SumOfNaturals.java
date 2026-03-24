package com.nerdcoder;

import java.util.stream.IntStream;

public class SumOfNaturals {

  private static void findAllSum(int end) {
    System.out.println("==========Using Stream============");
    int sum = IntStream
            .rangeClosed(1,end)
            .sum();
    System.out.println("Sum of first "+end+" natural numbers is:" +sum);
  }

  private static void usingFormula(int end) {
    System.out.println("==========Using Formula============");
    int sum = (end*(end+1))/2;
    System.out.println("Sum of first "+end+" natural numbers is:" +sum);
  }

  public static void main(String[] args) {
     findAllSum(5);
     usingFormula(5);
  }
}
