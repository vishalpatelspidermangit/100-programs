//Write a program to check whether a number is an Armstrong number.
import java.util.Scanner;

public class program47 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      System.out.println("enter your number ");
      int n = scn.nextInt();
    
      int temp1=n;
      int temp2=n;
      int count=0;
    int sum=0;
      while (temp1>0){
        count++;
        temp1=temp1/10;

      }
      while(temp2>0){
        int m=1;
        int a = temp2%10;
        for(int i=1; i<=count ; i++){
            m=m*a;
        }
         sum=m+sum;
         temp2=temp2/10;
      }
      if (n==sum){
        System.out.println("number is armstrong");
      }
      else{
        System.out.println("number is not armstrong");
      }
      System.out.println("thankyou");
      scn.close();
    }
  }