//Write a program to count the number of even and odd elements in an array
import java.util.Scanner;

public class program83 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       System.out.println("enter your array size  ");
    int size = scn.nextInt();
    int[] arr = new int[size];

    System.out.println("enter " + size + " number with spaces ");

    for(int i = 0 ; i<size ; i++){
        arr[i] = scn.nextInt();

    }
     int oc = 0;
     int ec = 0 ;
     for(int i=0; i<arr.length ; i++){
        if(arr[i]%2==0){
            ec++;
        }
        else{
            oc++;
        }

     }
     System.out.println("number of odd and even is " + oc +" , " + ec);
scn.close();
    }
}
