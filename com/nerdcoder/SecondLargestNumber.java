package com.nerdcoder;

public class SecondLargestNumber {

  public static void main(String[] args) {
    int[] arr = new int[]{4,2,0,1,9,34,5,6};
    printSecondLargest(arr);
    arr = new int[]{45,23,98,1,3,4,0, 29};
    printSecondLargest(arr);
  }

  private static void printSecondLargest(int[] arr) {
    int largest = -1;
    int secondLargest = -1;
    for (int i =0; i< arr.length; i++) {
      if (arr[i] > largest) {
        secondLargest = largest;
        largest = arr[i];
      } else if (arr[i]<largest && arr[i]>secondLargest) {
        secondLargest = arr[i];
      }
    }
    System.out.println("Second largest number is: "+secondLargest);
  }
}
