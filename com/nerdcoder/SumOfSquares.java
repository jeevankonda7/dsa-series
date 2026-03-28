package com.nerdcoder;

import java.util.stream.IntStream;

public class SumOfSquares {

  private static void printSumOfSquares(int n) {
    if (n==0 || n<0) {
      System.out.println("provide a valid number");
    }
    else {
      int sum =0;
      for (int i=1;i<=n;i++) {
        sum += (i*i);
      }
      System.out.println(sum);
    }
  }

  private static void sumOfSquaresWithStreams(int n) {
    int sum = IntStream.rangeClosed(1, n)
            .map(i -> i*i)
            .sum();
    System.out.println(sum);
  }

  public static void main(String[] args) {
     printSumOfSquares(5);
     sumOfSquaresWithStreams(5);
  }
}
