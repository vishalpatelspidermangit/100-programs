//Write a program to find the second largest element in an array
import java.util.Scanner;

public class program86 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of array you want ");
        int size = scn.nextInt();
        int[] arr = new int[size];
        System.out.println("enter " + size + " number with spaces ") ;

        for(int i = 0 ; i<size; i++){
            arr[i]=scn.nextInt();

        }
           int fl = 0;
           int sl =0;
           for(int i=0; i<arr.length; i++){
            if(arr[i]>fl){
                fl=arr[i];

            }
        
           }     
           for(int i=0;i<arr.length;i++){
            if(arr[i]>sl && arr[i]<fl){
                sl = arr[i];
            }
          }
          System.out.println("your second largest number is " + sl);
          scn.close();
    }
}
