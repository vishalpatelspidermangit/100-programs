//Write a program to read a number and check whether it is positive, negative or zero.
import java.util.Scanner;

public class program12 {
    public static void main(String [] arg ) throws Exception{
        Scanner scn = new Scanner(System.in);
System.out.println("enter the number ");
int n = scn.nextInt();
if (n>0){
    System.out.println("number is positive");
}
else if (n<0){
    System.out.println("number is negative");
}
else {
    System.out.println("number is zero ");
}
    }
}
