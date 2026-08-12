

//Write a program to read a number and check whether it is even or odd
import java.util.Scanner;

public class program11 {
       public static void main ( String [] arg ) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = scn.nextInt();
        if (n%2==0){
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }
       
       }
}