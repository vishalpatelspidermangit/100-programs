//Write a program to check whether a number is prime, using a function/method
import java.util.Scanner;

public class program92{
    static void checkprime(int x ){
        boolean found = false;
        for(int i=2; i<x ; i++){
            if(!(x%i==0)){
                System.out.println(x+" is prime number");
                found= true ; 
                 
            }
          else if (!found){
            System.out.println(x+" is not prime number");
          }
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      System.out.println("enter your number ");
     int x= scn.nextInt();
     if(x>2){
        System.out.println("put right number nigga");
     }
     else {
        checkprime(x);
     }
scn.close();
    }
}