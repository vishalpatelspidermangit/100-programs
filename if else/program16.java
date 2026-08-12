//Write a program to read a character and check whether it is a vowel or a consonant.
import java.util.Scanner;

public class program16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your alphabet ");
        char alpha = scn.next().charAt(0);
      if ( alpha=='A'|| alpha == 'a' || alpha == 'e' || alpha == 'E' || alpha == 'o' || alpha == 'O' || alpha == 'u' || alpha == 'U' || alpha =='i' || alpha == 'I'   ){
    System.out.println("alphabet is vowel");
      }
      else {
        System.out.println("aphabete is constant");
      }
    }
}