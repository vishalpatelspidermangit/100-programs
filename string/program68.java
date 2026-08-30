// Write a program to find the length of a string without using an inbuilt function
import java.util.Scanner;

public class program68 {
    public static void main(String[] argue) {
        Scanner scn = new Scanner(System.in);
       System.out.println("enter your name ");
       String name = scn.nextLine();
       int count =0;
       for( char c : name.toCharArray()){
       count++;
       }
 System.out.println(count);
 scn.close();
    }
}