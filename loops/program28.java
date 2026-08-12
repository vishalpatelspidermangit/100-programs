//Write a program to find the product of all natural numbers from 1 to n (factorial of n).

import java.util.Scanner;

public class program28 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("entr n ");
        int n = scn.nextInt();
        int p = 1;
        for( int i =1 ; i <=n ; i++ ){
            p=p*i;
        }
        System.out.println("product is " + p);
        System.out.println("factorial is " + p );

    }
}
