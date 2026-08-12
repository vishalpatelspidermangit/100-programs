//Write a program to read a year and check whether it is a leap year or not
import java.util.Scanner;

public class program15 {
public static void main(String[] args) throws Exception {
Scanner scn = new Scanner(System.in);
System.out.println("enter the year ");
int y  = scn.nextInt();
if (y%4==0){
    System.out.println("ohh yeah!! this year is leap year ");
}
else {
    System.out.println("year is not leap year");}

}    
}
