//Write a program to display all the natural numbers from 1 to n. (n is user input

import java.util.Scanner;

public class program21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    System.err.println("enter n ");
    int n = scn.nextInt();
    for ( int i = 0 ; i<=n ; i++){
    System.out.println(i);
    }
    }
}
