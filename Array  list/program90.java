//Write a program to merge two arrays into one.

import java.util.Scanner;

public class program90 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
System.out.print("Enter the size of the first array: ");
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements for the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scn.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " elements for the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scn.nextInt();
        }

        int[] mergedArray = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            mergedArray[i] = arr1[i];
        }

        for (int i = 0; i < n2; i++) {
            mergedArray[n1 + i] = arr2[i];
        }

        System.out.println("Merged Array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }

        scn.close();
    }
    }
