//Write a program to count the number of digits in a number n.

import java.util.Scanner;

public class program33 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your number = ");
        int n = scn.nextInt();
        n = Math.abs(n);
        int count= 0;
        if(n==0){
            count = 1;
        }
        while(n>0){
            n=n/10;
            count++;

    }
    System.out.println("sum of all digit is = " + count);
    }
}
