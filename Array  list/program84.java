//Write a program to search for an element in an array (linear search)
import java.util.Scanner;

public class program84 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
System.out.println("enter your array size  ");
    int size = scn.nextInt();
    int[] arr = new int[size];

    System.out.println("enter " + size + " number with spaces ");

    for(int i = 0 ; i<size ; i++){
        arr[i] = scn.nextInt();

    }
    boolean found = false;
    System.out.println("what element ");
     int e = scn.nextInt();
     for(int i= 0; i<arr.length ; i++){
        if(arr[i]==e){
            System.out.println(e+" this number is present at index " + i);
            found = true;
            break;
        }
        if(!found){
            System.out.println("doesn't present ");
        }
     }
scn.close();
}
}