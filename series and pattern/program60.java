//Write a program to find the sum of the series 1^2 + 2^2 + 3^2 + ... + n^2.
import java.util.Scanner;

public class program60 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your number ");
        int n= scn.nextInt();
        int sum=0;
        for(int i=1 ; i<=n ; i++){
        int s=i*i;
            sum = sum+s;
        }
       System.out.println(sum);
       scn.close();
    }
}
