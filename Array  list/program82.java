//Write a program to find the largest and smallest element in an array
import java.util.Scanner;

public class program82 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your array size  ");
    int size = scn.nextInt();
    int[] arr = new int[size];

    System.out.println("enter " + size + " number with spaces ");

    for(int i = 0 ; i<size ; i++){
        arr[i] = scn.nextInt();

    }
    int max = arr[0];
    int min = arr[0];
   for(int i =0 ; i<arr.length;i++){
      if (arr[i]>max){
        max=arr[i];
      }
      else if (arr[i]<min){
        min=arr[i];
      }
   }
 System.out.println("minimum and maximum is " + min + " " + max);
 scn.close();
    }
}
