package com.nerdcoder;

import java.util.stream.IntStream;

public class MultiplicationTable {

  private static void printTable(int num, int end) {
    if(num < 0) {
      System.out.println("negative number");
    }
    else {
      IntStream
              .rangeClosed(1, end)
              .forEach(i -> System.out.println(num +" x "+i +" = "+(num*i)));
    }
  }

  public static void main(String[] args) {
  printTable(5,10);
  }
}
