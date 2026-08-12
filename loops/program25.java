import java.util.Scanner;

public class program25 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter n ");
        int n = scn.nextInt();
        int sum = 0;
        for(int i =0 ; i <= n ; i++){
            sum= sum+i;
        }
        System.out.println("addition of all terms to n is " + sum);
    }
}
