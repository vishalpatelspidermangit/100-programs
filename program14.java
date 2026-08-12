//Write a program to read three numbers and find the smallest among them.
import java.util.Scanner;

public class program14 {
    public static void main (String [] arg ) throws Exception{
        Scanner scn = new Scanner(System.in);
     System.out.println("enter your three numbers ");
     int a = scn.nextInt();
     int b = scn.nextInt();
     int c = scn.nextInt();
  if (a<b & a<c){
    System.out.println(a + " is the smallest number");
  }
   else if (b<a & b<c){
    System.out.println(b + " is the smallest number");
   }
   else {
    System.out.println(c + " is the smallest number ");
   }
    }
}
