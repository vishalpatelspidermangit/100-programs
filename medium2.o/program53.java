//Write a program to find all factors (divisors) of a number n.
import java.util.Scanner;

public class program53 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       System.out.println("enter your number ");
       int n = scn.nextInt();
       System.out.println("factorial of " + n + "are ");
       for(int i =2 ; i<n ; i++){
        
        if(n%i==0){
          System.out.println(i);
        }
       }
       scn.close();
    }
}
