//Write a program to display all multiples of a number m up to n terms.
import java.util.Scanner;

public class program30 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter number and how many multiple you want ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        for (int i =1 ; i<=m ; i++){
            System.out.println( n +" * " + i + " = " + n*i);
        }
    }
}
