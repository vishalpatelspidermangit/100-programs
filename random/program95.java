//Write a program to count the number of prime digits present in a number n.
import java.util.Scanner;

public class program95 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
     System.out.println("enter your number ");
     int n = scn.nextInt();
      int count =0;
      while (n>0){
        int digit = n%10;
        for(int i =2 ; i <Math.sqrt(digit) ; i++){
            if(digit%i==0){
                break;
            }
            else {
                count++;
            }
        }
        n=n/10;
      }
      System.out.println("number of prime number in this number is "+count);
      scn.close();
    }
}
