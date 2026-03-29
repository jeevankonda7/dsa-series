package com.nerdcoder;

import java.util.Scanner;

/*
Find closet value of n which should be divisible by m
 */
public class FindClosestMultiple {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter n value: ");
    int n = input.nextInt();
    System.out.println("enter m value: ");
    int m = input.nextInt();
    printClosestMultiple(n,m);
  }

  private static void printClosestMultiple(int n, int m) {
    int n1 = m*(n/m);
    int n2 = ((n*m)>0)? (m*(n/m+1)):(m*(n/m-1));

    if (Math.abs(n-n1)<Math.abs(n-n2)) {
      System.out.println(n1);
    }
    else {
      System.out.println(n2);
    }

  }

}
