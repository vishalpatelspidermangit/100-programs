// Write a program to find the sum of the series 1 + 2 + 3 + ... + n.
import java.util.Scanner;

public class program59 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your number ");
        int n = scn.nextInt();
        int sum = 0;
       for(int i = 1; i<=n ; i++){
          sum = sum + i;
       }
       System.out.println("sum of the " +n+ " terms is  " + sum );
       scn.close();
    }
}
