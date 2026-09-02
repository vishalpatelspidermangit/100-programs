//Write a program to find the first non-repeating character in a string
import java.util.Scanner;

public class program77 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your string ");
        String str = scn.nextLine();
        boolean found = false ; 
        for( char c : str.toCharArray()){
        if(str.indexOf(c)==str.lastIndexOf(c)){
            System.out.println("first non repating character " + c);
            found = true;
            break;
        }
        
        
        }
        if(!found){
            System.out.println("no non repating charcter ");

        }
        scn.close();
    }
}
