package com.nerdcoder;

import java.util.Arrays;

public class ReverseAnArray {

  private static void reverseArray(int[] arr) {
    for (int i=0,j=arr.length-1; i<j; i++,j--) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }

    Arrays.stream(arr).forEach(i-> System.out.print(i+" "));
  }

  public static void main(String[] args) {
    reverseArray(new int[]{4,2,9,3,1,0,1,8});
    System.out.println("===================");
    reverseArray(new int[]{2,9,1,2,4});

  }
}
