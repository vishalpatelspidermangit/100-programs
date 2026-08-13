// Write a program to find the smallest digit in a number n.
import java.util.Scanner;

public class program39 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your number = ");
        int n = scn.nextInt();
        n=Math.abs(n);
        int mindigit = 9;
while(n>0){
    int i=n%10;
 if(i<=mindigit){
    mindigit=i;

 }
 n=n/10;

}
System.out.println("your smalest digit = " + mindigit);

    }
}
