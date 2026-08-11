//Write a program to read seconds and convert them into hours, minutes and seconds
import java.util.Scanner;

public class program10 {
    public static void main (String [] arg) throws Exception{
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the seconds ");
        double s = scn.nextDouble();
        double h = s /3600;
        double m = h*60;
        System.out.println("hours " + h + "\n minutes " + m + " \n seconds " + s );


    }
}
