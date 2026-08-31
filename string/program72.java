//Write a program to check whether a string is a palindrome
import java.util.Scanner;

public class program72 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your string ");
        String name = scn.nextLine();
        String rev = "";
        for(int i = name.length()-1; i>=0; i--){
      rev = rev+name.charAt(i);
        }
        if(name.equals(rev)){
            System.out.println("string is pallindrome");
        }
        else {
            System.out.println("string is not pallindrome");
        }
    scn.close();
    }
}
