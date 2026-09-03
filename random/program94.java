//Write a program to find the sum of digits of a number repeatedly until a single digit remains
import java.util.Scanner;

public class program94 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your number ");
           int n = scn.nextInt();
          while(n>9){
            int sum=0;
            while(n>0){
                sum = sum + (n%10);
                n=n/10;
            }
            n=sum;
          }
          System.out.println("sum of digits of a number repeatedly until a single digit remains is "+ n );
          scn.close();
    }
}