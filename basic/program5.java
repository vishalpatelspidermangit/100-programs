//Write a program to read the length and breadth of a rectangle and print its area and perimeter
import java.util.Scanner;
public class program5 {
    public static void main( String [] arg ) throws Exception{
    Scanner scn = new Scanner(System.in );
    System.out.println("enter length and breadth with space in them = ");
    int l = scn.nextInt();
    int b = scn.nextInt();
    int area = l*b;
    int perimeter = 2*(l+b);
    System.out.println("area and perimeter is " + area +" and " + perimeter);
    }}
