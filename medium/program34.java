// Write a program to display all the digits of a number n (one per line).
import java.util.Scanner;

public class program34 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         System.out.println("enter your number");
         int n =scn.nextInt();
         n = Math.abs(n);
         if (n==0){
            System.out.println("0");
         }
        while(n>0) {
            int j = n;
         int i = n;
         i=i%10;
         System.out.println(i);
         j=j/10;
         n=j; 
    }
    }
}
/*  other way to get !!!!!!!!!!!!!!!!!
import java.util.Scanner;

public class Program34String {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number:");
        
        // Read input as a string to preserve reading order
        String numStr = scn.next();
        
        // Loop through each character of the string
        for (int i = 0; i < numStr.length(); i++) {
            char ch = numStr.charAt(i);
            
            // Skip the minus sign if the user inputs a negative number
            if (ch == '-') {
                continue;
            }
            System.out.println(ch);
        }
        scn.close();
    }
}
*/
    


