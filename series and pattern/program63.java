//Write a program to print a right-angled triangle pattern of stars of height n
import java.util.Scanner;

public class program63 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("enter your number ");
        int n = scn.nextInt();
      for(int i =1 ; i<=n ; i++){

        for(int j =1 ;j<=i;j++){

            System.out.print(" * ");
        }
        System.err.println();
        
      }
      scn.close();
    }
}
