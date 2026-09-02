//Write a program to remove duplicate elements from an array.
import java.util.LinkedHashSet;
import java.util.Scanner;

public class program88 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        LinkedHashSet<Integer> uniqueElements = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            uniqueElements.add(arr[i]);
        }
        
        System.out.println("Array after removing duplicates:");
        for (int num : uniqueElements) {
            System.out.print(num + " ");
        }
        
        scn.close();
    }
}
