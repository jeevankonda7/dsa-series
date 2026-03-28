package com.nerdcoder;

import java.util.Scanner;

public class SwapTwoNumbers {

  private static void swapNumbers(int a, int b) {
    a = a^b;
    b = a^b;
    a = a^b;
    System.out.println(a +" "+b);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a: ");
    int a = sc.nextInt();
    System.out.println("enter b: ");
    int b = sc.nextInt();
    swapNumbers(a,b);
  }
}
