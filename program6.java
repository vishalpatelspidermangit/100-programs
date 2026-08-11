//Write a program to swap two numbers using a third variable
import javax.print.DocFlavor.STRING;
import java.util.Scanner;
public class program6 {
    public static void main ( String [] arg ) throws Exception{
        Scanner scn = new Scanner(System.in);
  System.out.println("enter the number a ");
  int a = scn.nextInt();
  System.out.println("enter the nuber b ");
int b = scn.nextInt();
System.out.println("your a is " + a + " \n and b is " + b);
int c=a;
a=b;
b=c;
System.out.println("after swapping the nubmbers we get a as " + a + " \n and b is " + b );
    }
}
