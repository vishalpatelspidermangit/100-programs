//Write a program to check whether a number is a palindrome and a prime at the same time
import java.util.Scanner;

public class program96 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       System.out.println("enter your number ");
       int n = scn.nextInt();
       int original = n;
       int rev =0;
       while(n>0){
        rev = (n%10)+rev*10;
        n=n/10;
       }
     for(int i = 2 ; i<Math.sqrt(original);i++){
        if(original%i==0){
            break;
        }
        else{
            if(original==rev){
                System.out.println(original + " number is both prime and pallindrome ");
                break;
                
            }
            else{
                System.out.println("noo number is not ");
            }
        }
     }
 scn.close();

    }
}
