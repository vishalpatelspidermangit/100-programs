//Write a program to convert a decimal number into its binary equivalent
import java.util.Scanner;

public class program98 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
      System.out.println("enter your number ");
      int n = scn.nextInt();

      int binary =0;
      while(n>=1){
       binary = (n%2) + binary*10;
       n=n/2;
      }
      System.out.println(" in binary =>"+binary);
      scn.close();
    }
}
