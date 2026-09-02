//Write a program to count the frequency of each element in an array
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class program87 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         System.out.println("enter your array size  ");
    int size = scn.nextInt();
    int[] arr = new int[size];

    System.out.println("enter " + size + " number with spaces ");

    for(int i = 0 ; i<size ; i++){
        arr[i] = scn.nextInt();

    }
        
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        System.out.println("Element | Frequency");
        System.out.println("-------------------");
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("   " + entry.getKey() + "    |    " + entry.getValue());
        }
        scn.close();
    }
}