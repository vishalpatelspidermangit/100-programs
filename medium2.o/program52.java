// Write a program to check whether a number is a Harshad (Niven) number
import java.util.Scanner;

public class program52 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
     System.out.println("enter your number ");
     int n=scn.nextInt();
     int temp =n;
     int sum=0;
     while (temp>0) {
        int d = temp%10;
      sum=sum+d;
        temp=temp/10;
     }
     if(n%sum==0){
        System.out.println(n+" number is harshad (nirvan)");
     }
     else {
        System.out.println(n+ " number is not harshad (nirvan)");
     }
     scn.close();
    }
}
