//Write a program to remove all spaces from a string.
import java.util.Scanner;

public class program75 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         System.out.println("enter your string ");
         String name = scn.nextLine();
         String nowhitespace = name.replace("\\s+", "");
         System.out.println("wothout whitespace " + nowhitespace);
         String nospace = name.replace(" " , "");
         System.out.println("nospace " + nospace);
         scn.close();

    }
}
