// Write a program to count the frequency of each character in a string
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class program74 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your string ");
        String name = scn.nextLine();
        HashMap <Character , Integer> h = new HashMap<>();
        for(char c : name.toCharArray()){
            h.put(c, h.getOrDefault(c, 0)+1 );
        } 
        System.out.println("frequency of each charcter is ");
        for(Map.Entry<Character,Integer> entry : h.entrySet()){
            System.out.println("'" + entry.getKey() + ":" + entry.getValue());

        }
     scn.close();
    }
}
