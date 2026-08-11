//Write a program to read two numbers and print their sum, difference, product and quotient
import java.util.Scanner;

public class program3 {
    public static void main ( String [] arg) throws Exception{
        Scanner scn = new Scanner(System.in);
    System.err.println("enter your first number = ");
    double x = scn.nextDouble();
    System.out.println("enter your second number = ");
         double y = scn.nextDouble();
         System.err.println("your first nuber and second nuber is " + x + " and " + y);
         System.out.println("adiition will be = " +  (x  + y));
         System.out.println("subtracton will be = " + (x-y));
         System.out.println("division will be = " + (x/y));
         System.out.println("multiplication will be = " + (x*y));
}
}
