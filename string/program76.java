// Write a program to check whether two strings are anagrams of each other
    
    
import java.util.Scanner;
import java.util.Arrays; 

public class program76 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        
        System.out.println("Enter your first string: ");
        String s1 = scn.nextLine(); 
        
        System.out.println("Enter your second string: ");
        String s2 = scn.nextLine();
        
        s1 = s1.replaceAll("\\s+", "").toLowerCase();
        s2 = s2.replaceAll("\\s+", "").toLowerCase();
        
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        if (a1.length != a2.length) {
            System.out.println("Not an anagram.");
        } else {
        
            Arrays.sort(a1);
            Arrays.sort(a2);
            
            
            if (Arrays.equals(a1, a2)) {
                System.out.println("They are anagrams!");
            } else {
                System.out.println("Not an anagram.");
            }
        }
        
        scn.close();
    }
}
