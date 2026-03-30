package com.nerdcoder.sortingtechniques;

import java.util.Arrays;

public class SelectionSort {

  public static void main(String[] args) {
    sortWithSelectionSort(new int[]{36,98,12,9,0,75});
  }

  private static void sortWithSelectionSort(int[] arr) {
    int n = arr.length;
    for (int i=0; i<=n-2; i++) {
      int min = arr[i];
      for (int j = i+1; j<=n-1; j++) {
        if (arr[j]<min) {
          min = arr[j];
          arr[j]=arr[i];
          arr[i] = min;
        }
      }
    }
    Arrays.stream(arr).forEach(i -> System.out.print(i+","));

  }

}
