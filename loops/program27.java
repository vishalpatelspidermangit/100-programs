//Write a program to find the sum of all odd numbers from 1 to n.
import java.util.Scanner;

public class program27 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
 System.out.println("enter n ");
     int n = scn.nextInt();
     int sum = 0 ;
     for (int i = 0 ; i <=n ; i++){
        if ( !(i%2==0)){
    sum = sum + i ;
    }
}
System.out.println("your addition of all odd number is " + sum);
} 
}
