//Write a program to display all even numbers from 1 to n

import java.util.Scanner;

public class program23 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter n ");
        int n = scn.nextInt();
        for (int i =1 ; i <= n ; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
