//Write a program to count how many numbers from 1 to n are divisible by 3
import java.util.Scanner;

public class program31 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter n ");
        int n = scn.nextInt();
       int a=0;
     for(int i =1 ; i <=n ; i++){
        if ( i%3 == 0){
            a++;

        }
     }
     System.out.println(a);
    }
}
