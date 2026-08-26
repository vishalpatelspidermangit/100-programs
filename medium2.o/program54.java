//Write a program to find the GCD (HCF) of two numbers.
import java.util.Scanner;

public class program54 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your numbers ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        int f=1;
        for(int i =1 ; i<n && i<m; i++){
         if (n%i==0 && m%i==0){
      f=i;
         }
         
         }     
         System.out.println("your hcf is = " + f);
         scn.close();
        }
        



    }
