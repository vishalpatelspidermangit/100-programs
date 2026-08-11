//Write a program to read two numbers and print their sum
import java.util.Scanner ;
public class program2 {
    public static void main (String [] arg)throws Exception{
        Scanner scn = new Scanner(System .in);

        int x,y;
    System.out.println("enter your number = ");
          x=scn.nextInt();
          System.out.println("enter another number = ");
          y=scn.nextInt();
          System.err.println("addition is " + x+y);

    }
}
