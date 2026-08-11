//Write a program to read the radius of a circle and print its area and circumference
import java.util.Scanner;
public class program4 {
    public static void main( String [] arg ) throws Exception {
  Scanner scn = new Scanner(System.in) ;
   System.out.println("enter the radius");
   double r = scn.nextDouble();
   double area = (22/7)*r*r;
   double circ = 2*(22/7)*r;
   System.out.println("area and circumference of circle is " + area + " and " + circ);
   
    }
}
