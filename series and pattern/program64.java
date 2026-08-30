//Write a program to print an inverted right-angled triangle pattern of stars of height n
import java.util.Scanner;

public class program64 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your number ");
      int n= scn.nextInt();
   for(int i=n ; i>=1;i--){
    for(int j=1; j<=i ; j++){
        System.out.print(" * ");
    }
    System.err.println();
   }
   scn.close();

    }
}
