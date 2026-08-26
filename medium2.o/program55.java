// Write a program to count the number of factors of a number n.

import java.util.Scanner;

public class program55 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your number = ");
        int n = scn.nextInt();
        int count =0;
        for(int i =2 ; i<=n ; i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.println(count);
        scn.close();
}
}

