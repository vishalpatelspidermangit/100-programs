//Write a program to print a number triangle (row i contains numbers 1 to i).
import java.util.Scanner; 

public class program67 { 
    public static void main(String[] args) { 
        Scanner scn = new Scanner(System.in); 
        System.out.print("Enter your number: "); 
        int n = scn.nextInt(); 
        
         for (int i = 1; i <= n; i++) { 
            
           for (int j = 1; j <= n - i; j++) { 
                System.out.print(" "); 
            } 
            
            for (int k = 1; k <= i; k++) { 
                System.out.print(k + " "); 
            } 
            
          
            System.out.println(); 
        } 
        scn.close();
    } 
}
