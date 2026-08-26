//Write a program to display the first n terms of the Fibonacci series.

import java.util.Scanner;

public class program57 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your number = ");
        int n= scn.nextInt();
        int a=0,b=1;
        for (int i =1 ; i<=n ; ++i )
          {
            System.out.println(a+" ");
            int next = a+b;
            a=b;
            b=next;

          }   
          scn.close();      
        }
    }

