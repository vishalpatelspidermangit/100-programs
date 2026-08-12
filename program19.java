//Write a program to read a number and check whether it is divisible by both 3 and 5
import java.util.Scanner;

public class program19 {
    public static void main ( String [] arg){
        Scanner scn = new Scanner(System.in);
     System.out.println("enter your number ");
     int n = scn.nextInt();
     if (n %3 ==0 && n % 5==0){
        System.out.println("number is divisible by both 3 and 5 ");
     }
     else {
        System.out.println("number is not divisible by both 3 and 5 ");
     }
    }
}
