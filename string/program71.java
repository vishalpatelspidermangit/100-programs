//Write a program to reverse a string.
import java.util.Scanner;

public class program71 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         System.out.println("enter your word ");
         String name = scn.nextLine();
         String rev = "";
         for(int i = name.length()-1 ; i>=0 ; i-- ){
            rev = rev+ name.charAt(i);
         }
        System.out.println(rev);
        scn.close();
    }
}
