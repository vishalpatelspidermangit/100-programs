// Write a program to check whether a number n is a palindrome (reads the same reversed).
import java.util.Scanner;

public class program41 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
           System.out.println("enter your number ");
           int n = scn.nextInt();
           n = Math.abs(n);
           int org = n;
           int rev = 0;
     while(n>0){
        int i = n%10;
        rev = (rev*10)+i;
        n=n/10;
     }
     if(rev==org){
        System.out.println("number is palindrome");

     }
     else{
        System.out.println("number is palindrome ");
     }

            
    }
}
