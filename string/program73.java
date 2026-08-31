//Write a program to convert a string to uppercase and lowercase without inbuilt case functions
import java.util.Scanner;

public class program73 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your string ");
        String name = scn.nextLine();
        char [] upperclass = name.toCharArray();
        char [] lowerclass = name.toCharArray();
       for(int i =0 ; i< upperclass.length; i++){
        if(upperclass[i]>='a' && upperclass[i]<='z'){
         upperclass[i]= (char)(upperclass[i]-32);
        }
     
        if(lowerclass[i]>='A' && lowerclass[i]<= 'Z'){
            lowerclass[i] = (char)(lowerclass[i]+32);

        }
     
       }
        System.out.println("uppperclass " + new String(upperclass));
     System.out.println("lowerclass " +new String(lowerclass));
     scn.close();
    }
}
