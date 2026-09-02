//Write a program to find the sum of all even-indexed and odd-indexed elements separately
import java.util.Scanner;

public class program91 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       System.out.print("Enter the size of the array: ");
        int n = scn.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int evenIndexSum = 0;
        int oddIndexSum = 0;

    
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenIndexSum += arr[i]; 
            } else {
                oddIndexSum += arr[i]; 
            }
        }

        System.out.println("Sum of even-indexed elements: " + evenIndexSum);
        System.out.println("Sum of odd-indexed elements: " + oddIndexSum);

        scn.close();
    }
}
