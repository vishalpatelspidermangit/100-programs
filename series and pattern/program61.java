//Write a program to find the sum of the series 1 + 1/2 + 1/3 + ... + 1/n.
import java.util.Scanner;

public class program61 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your number ");
        int n = scn.nextInt();
        int sum =0;
              for (int i=1; i<=n ; i++){
               int d=1/i;
               sum=sum+d;
                              }
                    System.out.println(sum);          
scn.close();
    }
}
