// Write a program to count the number of words in a sentence.
import java.util.Scanner;

public class program70 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your sentence ");
        String sent = scn.nextLine();
        String[] words = sent.trim().split("\\s+");
        System.out.println(words.length);
        scn.close();
    }
}
