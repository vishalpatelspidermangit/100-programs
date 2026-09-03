//Write a program to display a menu that lets the user repeatedly choose any of the above tasks
//until they choose to exit
import java.util.Scanner;

public class program100 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Perform Task 1");
            System.out.println("2. Perform Task 2");
            System.out.println("3. Perform Task 3");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
           
            choice = scn.nextInt();

            
            switch (choice) {
                case 1:
                    System.out.println("\n--> Executing Task 1...");
                    // Add your Task 1 code here
                    break;
                case 2:
                    System.out.println("\n--> Executing Task 2...");
                    // Add your Task 2 code here
                    break;
                case 3:
                    System.out.println("\n--> Executing Task 3...");
                    // Add your Task 3 code here
                    break;
                case 4:
                    System.out.println("\n--> Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("\n--> Invalid choice! Please select a valid option.");
            }
            
        } while (choice != 4); 

        scn.close();
    }
}
