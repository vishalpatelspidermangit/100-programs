// Write a program to find the product of all digits of a number n
import java.util.Scanner;

public class program36 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
System.out.println("entr your number ");
int n = scn.nextInt();
n = Math.abs(n);
int prd = 1;
while (n>0){
    int i = n%10;
    prd=prd*i;
    n=n/10;
}
System.out.println("product is " + prd);

    }
}
