//Write a program to display all numbers from 1 to n that are divisible by 3 or 5.
import java.util.Scanner;

public class program32 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("enter n ");
        int n = scn.nextInt();
        int a = 0;
        for(int i=1 ; i<=n ; i++){
            if(i%3==0 && i%5==0){
                a++;
            }
        }
        System.out.println(a);
    }
}
