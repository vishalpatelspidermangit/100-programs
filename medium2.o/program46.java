import java.util.Scanner;

public class program46 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scn.nextInt();
        
        int count = 0; 
        int num = 2;    

        System.out.println("The first " + n + " prime numbers are:");
        
        while (count < n) {
            boolean isPrime = true;

                for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                            break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }
        scn.close();
            }
}
