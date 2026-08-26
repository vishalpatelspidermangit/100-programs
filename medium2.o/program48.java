// Write a program to display all Armstrong numbers from 1 to n.
import java.util.Scanner;

public class program48 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
     System.out.println("enter the value of n ");
     int n = scn.nextInt();
     System.out.println("armstrong numbers are ");
    for(int i=10; i<=n ;i++){
        
      int temp1=i;
      int temp2=i;
      int count=0;
      int sum=0;
      while (temp1>0){
        count++;
        temp1=temp1/10;

      }
      while(temp2>0){
        int m=1;
        int a = temp2%10;
        for(int j=1; j<=count ; j++){
            m=m*a;
        }
         sum=m+sum;
         temp2=temp2/10;
      }
      if (i==sum){
        System.out.println(i);
      }
      
      
      scn.close();
    }
    System.out.println("thankyou");
    }
}