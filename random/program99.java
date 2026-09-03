//Write a program to convert a binary number into its decimal equivalent
import java.util.Scanner;

public class program99 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your binary number: ");
        int n = scn.nextInt();
        
        int decimal = 0;
        int power = 1; // Represents 2^0 initially
        
        int temp = n; // Store original number for the final print statement
        
        while (temp > 0) {
            int lastDigit = temp % 10;       // 1. Extract the last digit (0 or 1)
            decimal = decimal+( lastDigit * power);    // 2. Multiply by the current power of 2 and add to total
            power = 2*power;                      // 3. Increase the power of 2 for the next digit
            temp = temp/10;                      // 4. Remove the last digit from the number
        }
        
        System.out.println("The decimal equivalent of " + n + " is =>" + decimal);
        scn.close();
    }
}