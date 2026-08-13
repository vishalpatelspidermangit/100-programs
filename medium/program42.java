// Write a program to replace all zeros in a number n with the digit 5.
import java.util.Scanner;

public class program42 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
     System.out.println("enter your number ");
     int n = scn.nextInt();
     n=Math.abs(n);
     if(n==0){
        System.out.println("give right info bruhh and answer is 5 dude ");
     }

     int rev=0;
     int org = 0;
     while (n>0){
        int i = n%10;
        if(i==0){
            i=5;

        }
        rev=(rev*10)+i;
        n=n/10;
     }
     while(rev>0){
        int j = rev%10;
        org = (org*10)+j;
        rev=rev/10;
     }
     System.out.println("here we gooo " + org );
    }
}
