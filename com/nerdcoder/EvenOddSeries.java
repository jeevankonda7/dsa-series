package com.nerdcoder;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EvenOddSeries {

  private static void usingBitwise(int num) {
    //Ex:
    //9 --> 1001
    //1 --> 0001
    if ((num & 1) == 1) {
      System.out.println("Odd number");
    } else {
      System.out.println("Even number");
    }
  }

  private static void usingStreams() {
    List<Integer> numbers = List.of(2,9,3,6,12,75);
    numbers
            .stream()
            .filter(num -> (num & 1)!=1)
            .forEach(System.out::println);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = input.nextInt();
    usingBitwise(num);
    System.out.println("============Using Streams=========");
    usingStreams();
  }

}
