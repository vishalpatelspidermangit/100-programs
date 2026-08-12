//Write a program to read a character and check whether it is an alphabet, digit or special symbol
import java.util.Scanner;

public class program17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
System.out.println("give your input");
char ch = scn.next().charAt(0);

if (ch >='a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
    System.out.println("it is alphabet");
}
else if (ch >= 0 && ch <= 9 || ch >= (-9) ){
    System.out.println("it is digit");
}
else {
    System.out.println("it is special character");
}

}
}