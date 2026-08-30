//Write a program to count the number of vowels and consonants in a string.
import java.util.Scanner;

public class program69 {
    
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("enter your string ");
        String str = scn.nextLine();
        int nv= 0 , nc=0;
        for(char c : str.toCharArray()){
            if ( c== 'a' || c== 'A' || c=='e' || c== 'E' || c== 'u'|| c=='U' || c=='i' || c=='I' || c=='o' || c=='O' ){
                  nv++;
            }
            else {
                nc++;
            }

        }
        System.out.println("number of vowels are " + nv + " number of constants are "+ nc);
        scn.close();
    }
}
