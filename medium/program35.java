//Write a program to find the sum of all digits of a number n.
import java.util.Scanner;

public class program35 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
   System.out.println("entr your number = ");
   int n = scn.nextInt();
   n = Math.abs(n);
   int sum =0;
   while(n>0){
   int i=n%10;
  sum=sum+i;
  n=n/10;
   }
   System.out.println("yur sum of all digit is "+sum);
    }
}
