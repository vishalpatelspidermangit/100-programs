//Write a program to swap two numbers without using a third variable.
import java.util.Scanner;
public class program7 {
    public static void main (String [] arg ) throws Exception {
   Scanner scn = new Scanner(System.in);
System.out.println("enter the number a ");
  int a = scn.nextInt();
  System.out.println("enter the nuber b ");
int b = scn.nextInt();
System.out.println("your a is " + a + " \n and b is " + b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("after swapping the nubmbers we get a as " + a + " \n and b is " + b );

    }
}
