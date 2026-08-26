// Write a program to find the LCM of two numbers.
import java.util.Scanner;

public class program56 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your numbers = ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        int lcm = (m>n) ? m:n;
        while(true){
            if (lcm%m==0 && lcm%n==0)
            {
            System.out.println("the lcm is " + lcm);
            break;    
            }
            lcm++;
        }
        
         scn.close();
    }
}
