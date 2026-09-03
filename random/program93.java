//Write a program to print all prime numbers between two given numbers a and b
import java.util.Scanner;

public class program93 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your number ");
        int a = scn.nextInt();
        System.out.println("enter your next number ");
        int b = scn.nextInt();
      
        System.out.println("your prime number between "+a+" and "+ b);
        if(a<2){
            a=2;
        }

        for(int i=a ; i<=b ; i++){
            boolean found = true;
            for(int j = 2 ; j<=Math.sqrt(i) ; j++){
                if(i%j==0){
                    found = false ; 
                    break;
                }
            }
            if(found){
                System.out.println(i);
            }
        }
        scn.close();
    }
}