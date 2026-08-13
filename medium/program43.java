//Write a program to find the sum of the first and last digit of a number n.
import java.util.Scanner;

public class program43 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("enter your number ");
        int n = scn.nextInt();
      n = Math.abs(n);
      int i = n%10;
      int f=n;
      while(f>=10){
        f=f/10;
      }
 System.out.println("addition = " +(i+f) );
        
    }
   
}
