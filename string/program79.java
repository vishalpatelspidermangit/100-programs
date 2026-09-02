//Write a program to toggle the case of each character in a string.
import java.util.Scanner;

public class program79 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your string ");
        String str = scn.nextLine();
         StringBuilder sb = new StringBuilder(str);
        for(int i =0 ; i<str.length() ; i++){
      char c = sb.charAt(i);

      if(Character.isUpperCase(c)){
        sb.setCharAt(i, Character.toLowerCase(c));
      }
      else if (Character.isLowerCase(c)){
        sb.setCharAt(i, Character.toUpperCase(c));
      }
    
        }
        System.out.println("after toggle =>" + sb.toString());

    }
}
