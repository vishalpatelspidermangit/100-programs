//Write a program to find the sum of all even numbers from 1 to n
import java.util.Scanner;

public class program26 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
 System.out.println("enter n ");
        int n = scn.nextInt();
        int sum = 0;
        for (int i =1 ; i <= n ; i++){
            if (i%2==0){
    sum = sum + i;

            }
    }
    System.out.println("addition of all even is " + sum);
}
}
