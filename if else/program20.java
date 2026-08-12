//Write a program to read the age of a person and check whether they are eligible to vote
import java.util.Scanner;

public class program20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your age ");
        int age = scn.nextInt();
        if( age >= 18){
            System.out.println("eligible to vote ");
        }
        else {
            System.out.println("you can't vote ");
        }
    }
}
