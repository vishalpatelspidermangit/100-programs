//Write a program to count the number of even digits and odd digits in a number n
import java.util.Scanner;

public class program40 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your number ");
        int n = scn.nextInt();
        n=Math.abs(n);
        int ecount=0;
        int ocount=0;

        while(n>0){
            int i = n%10;
            if(i%2==0){
               ecount++;
            }
            else{
                 ocount++;
            }
            n=n/10;
        }
        System.out.println("number of odd digit = "+ ocount + "\n number of even digit = " + ecount);

    }
}
