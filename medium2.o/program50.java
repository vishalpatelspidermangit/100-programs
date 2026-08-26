//Write a program to check whether a number is a strong number (sum of factorials of its digits)
import java.util.Scanner;

public class program50{
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        System.out.println("enter your number ");
        int n = scn.nextInt();
        int sum=0;
        if(n>0){
          
         int temp =n;
         while(temp>0){
            int d=temp%10;
            int f=1;
            for(int i = d ; i>=1 ; i-- ){
             f=f*i;
            }
          sum  = sum + f;
          temp=temp/10;

         }
         if (sum==n){
            System.out.println(n+" number is strong number ");
         }
         else {
            System.out.println(n+"number is not strong number");
         }
        }
        else{
            System.out.println("number is not strong and put a positiveeeee");
     
        }
        scn.close();
    }
}