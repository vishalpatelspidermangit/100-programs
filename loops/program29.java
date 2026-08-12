//Write a program to display the multiplication table of a number n
import java.util.Scanner;

public class program29 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
System.out.println(" enter n ");
int n = scn.nextInt();
int i;
for ( i =1 ; i <=10 ; i++){
    System.out.println(n + " * " + i + " = " + n*i);
}

}
}
