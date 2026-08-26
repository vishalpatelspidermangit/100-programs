//Write a program to check whether a number is a perfect number.
import java.util.Scanner;

public class program49 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
          System.out.println("enter your number ");
          int n =scn.nextInt();
          if(n>0)  {
            int sum=0;
            
           for(int i=1; i<n ; i++){
            if(n%i==0){
                sum=sum+i;
            }
           }
           if(sum==n){
            System.out.println( n+" number is perfect ");
           }
           else{
            System.out.println( n+" number is not perfect ");
           }
          }
          else{
            System.out.println("number is not perfect and not positiveeee ");
          }
          scn.close();
        }
        }

