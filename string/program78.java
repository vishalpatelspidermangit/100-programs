//Write a program to replace all occurrences of a character with another character in a string
import java.util.Scanner;

public class program78 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your string ");
        String str = scn.nextLine();
        System.out.println("entr your character that you want to change ");
        char c  = scn.next().charAt(0);
        System.out.println("enter the change  ");
        char c1 = scn.next().charAt(0);
        str = str.replace(c, c1);
        System.out.println("after changing the string => " + str);
          scn.close();

    }
}
