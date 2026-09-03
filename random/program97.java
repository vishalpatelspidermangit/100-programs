//Write a program to find the largest and smallest number that can be formed using the digits of

import java.util.Scanner;
import java.util.Arrays;

public class program97 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        String num = scn.next();
        char[] digits = num.toCharArray();
    

        Arrays.sort(digits);
        String smallest = new String(digits);
        String largest = new StringBuilder(smallest).reverse().toString();
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
        
        scn.close();
    }
}