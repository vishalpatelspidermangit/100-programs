// Write a program to find the sum of the first n terms of the Fibonacci seriesimport java.util.Scanner;
import java.util.Scanner;
public class program58 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your number = ");
        int n = scn.nextInt();
        int a=0,b=1;
        int sum = 0;
        for (int i =1 ; i<=n ; ++i )
          {
            sum = a+sum;
            int next = a+b;
            a=b;
            b=next;
           
          }   
          System.out.println(sum);
          scn.close();

    }
}
