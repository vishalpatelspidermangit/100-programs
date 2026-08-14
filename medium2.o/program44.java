//Write a program to read a number and check whether it is prime or not.
import java.util.Scanner;

public class program44 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    System.out.println("enter your number ");
    int n = scn.nextInt();
    if(n==0 || n==1){
        System.out.println("you need a brain");
    }
    int i ;
    for (i = 2 ; i<n ; i++  ){
        if(n%i==0){
             System.out.println("number is not prime ");
        }
    }
    System.out.println("number is prime");
}
}
