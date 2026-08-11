//Write a program to read three numbers and find the largest among them
import java.util.Scanner;

public class program13 {
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
     System.out.println("enter your three numbers ");
     int x= scn.nextInt();
     int y = scn.nextInt();
     int z = scn.nextInt();
     if (x>y & x>z){
        System.out.println(x+ " is a biggest number ");
     }
     else if (y>x & y>z){
        System.out.println(y + " is a biggest number ");
     }
     else {
        System.out.println(z + " is a biggest number ");
     }
        
    }
}
