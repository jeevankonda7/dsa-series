package com.nerdcoder;

import java.util.Arrays;
import java.util.stream.Stream;

public class MoveZeroesToLast {

  private static void moveZeroes(int[] arr) {
    if (arr.length == 0) {
      System.out.println("array is empty");
    }
    else {
      int i =0;
      int j = arr.length-1;
      while(i<j) {
        if (arr[i] ==0 && arr[j] ==0) {
          j--;
          continue;
        }
       if (arr[i] ==0 && arr[j] !=0) {
         arr[i] = arr[j];
         arr[j] = 0;
         j--;
       }
       i++;
      }
    }
    Arrays.stream(arr).forEach(i -> System.out.print(i+" "));

  }

  private static void moveZeroesToEnd(int[] arr) {
    if (arr.length == 0) {
      System.out.println("provide a valid array");
    }
    else {
      for (int i =0,j = arr.length-1; i<j;) {
        if (arr[i] ==0 && arr[j] ==0) {
          j--;
          continue;
        }
        if (arr[i] ==0 && arr[j] !=0) {
          arr[i] = arr[j];
          arr[j] = 0;
          j--;
        }
        i++;
      }
    }
    Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
  }

  public static void main(String[] args) {
//    int[] arr = new int[]{8,9,3,0,1,2,0,4,2};
    int[] arr = new int[]{0,9,3,5,1,2,0,0,0};
    moveZeroesToEnd(arr);
  }
}
