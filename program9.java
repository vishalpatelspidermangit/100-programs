//Write a program to read the marks of 5 subjects and print the total and average.
import java.util.Scanner;
public class program9 {
    public static void main ( String [] arg ) throws Exception{ 
Scanner scn = new Scanner(System.in);
System.out.println("enter your all 5 subject marks subject ");
double a= scn.nextDouble();
double b= scn.nextDouble();
double c= scn.nextDouble();
double d= scn.nextDouble();
double e = scn.nextDouble();
double average = (a+b+c+d+e)/5;
System.out.println("average all 5 subject is " + average);
    }
}
