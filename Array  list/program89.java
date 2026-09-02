//Write a program to sort an array in ascending order (bubble sort)
import java.util.Scanner;

public class program89 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         System.out.print("Enter the size of the array: ");
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        // Bubble Sort Algorithm
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; 
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    swapped = true;
                }
            }
            
            if (!swapped) {
                break;
            }
        }
        
        System.out.println("Array sorted in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        scn.close();
    }
}
