//Write a program to read n elements into an array and print them

import java.util.Scanner;

public class program80{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("enter your array size  ");
    int size = scn.nextInt();
    int[] arr = new int[size];

    System.out.println("enter " + size + " number with spaces ");

    for(int i = 0 ; i<size ; i++){
        arr[i] = scn.nextInt();

    }
    for(int i=0 ; i<arr.length ; i++){
        System.out.println("- _ - your array at index "+i + " => " + arr[i]);
    }
    scn.close();
  }
}