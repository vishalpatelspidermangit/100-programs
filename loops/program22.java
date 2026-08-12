//Write a program to display all natural numbers from 1 to n in reverse order.

import java.util.Scanner;

public class program22 {
    public static void main(String[] args) {
    
    Scanner scn = new Scanner(System.in);
 System.out.println("enter n ");
 int n = scn.nextInt();
 for ( int i =n ; i >= 1 ; i--){
    System.out.println(i);
 }
} 
}