//Write a program to reverse the elements of an array.
import java.util.Scanner;

public class program85 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         System.out.println("enter your array size  ");
    int size = scn.nextInt();
    int[] arr = new int[size];

    System.out.println("enter " + size + " number with spaces ");

    for(int i = 0 ; i<size ; i++){
        arr[i] = scn.nextInt();

    }
  int left = 0;
  int right = arr.length -1;
  while(left<right){
    int temp = arr[left];
    arr[left]=arr[right];
    arr[right]=temp;

    left++;
    right--;

  }
  System.out.println("reverse array ");
    for(int i =0 ; i<arr.length;i++){
    System.out.println(arr[i]);
    }
    scn.close();
    }
}
