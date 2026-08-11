//Write a program to read a temperature in Celsius and convert it to Fahrenheit
import java.util.Scanner;
public class program8 {
    public static void main (String [] arg ) throws Exception{
 Scanner scn = new Scanner(System.in);
System.out.println("enter the room teperature in celcius ");
double c= scn.nextDouble();
double f = c + 273 ;
System.out.println("temperature in fahrenheit " + f );
    }
}
