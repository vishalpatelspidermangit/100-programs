//Write a program to find the sum and average of all elements in an array.
import java.util.Scanner;

public class program81 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("entr size of your array ");
        int size = scn.nextInt();
        double[] arr = new double[size];
        System.out.println("enter " +size+ " number with spaces ");
        for(int i =0 ; i<arr.length ; i++){
     arr[i]= scn.nextDouble();
        }
        double sum=0;
        for(int i=0; i<arr.length ; i++){
            sum= sum + arr[i];
        }
        double avrg =sum/size;
        System.out.println("sum and avreage of this array is " + sum + " " + avrg);
        scn.close();
    }
}
