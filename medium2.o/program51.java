//Write a program to check whether a number is an automorphic number.

import java.util.Scanner;

public class program51 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your number ");
        int n = scn.nextInt();
        int s = n*n;
        if(s%10==n){
            System.out.println( n+" number is automorphic ");
        }
        else{
            System.out.println(n+" number is not automorphic");
        }
        scn.close();
    }
}
