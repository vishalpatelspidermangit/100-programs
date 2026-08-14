//Write a program to display all prime numbers from 1 to n.
import java.util.Scanner;

public class program45 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
   System.out.println("enter your number");
   int m= scn.nextInt();
   System.out.println("your prime number are ");
   for(int n =2 ; n<=m ; n++){
    boolean isprime = true ;

    for(int i =2 ; i*i<=n ; i++){
        if(n%i==0){
            isprime=false;
            break;
        }
    }
    if(isprime){
        System.out.println(n);
    }
   }
   
    }
   } 
    
