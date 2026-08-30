//Write a program to print Pascal's triangle for n rows.
import java.util.Scanner;

public class program68 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scn.nextInt();

        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int number = 1; 
            
            for (int k = 0; k <= i; k++) {
                System.out.print(number + " ");
                
                number = number * (i - k) / (k + 1);
            }

            System.out.println();
        }
        scn.close();
    }
}
