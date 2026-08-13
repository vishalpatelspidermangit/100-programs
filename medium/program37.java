//Write a program to reverse a number n
import java.util.Scanner;

public class program37 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your number ");
        int n = scn.nextInt();
        n = Math.abs(n);
        int rev =0;
        while(n>0){
            int i = n%10;
            rev = (rev*10)+i;
            n=n/10;
        }
       System.out.println("reverse number is " + rev);
        
    }
}
