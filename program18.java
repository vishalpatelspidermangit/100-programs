//Write a program to read the marks of a student and print the grade (A/B/C/D/Fail)
import java.util.Scanner ;
public class program18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your marks all marks ");
        double x = scn.nextDouble();
          double y = scn.nextDouble();
            double z = scn.nextDouble();
              double a = scn.nextDouble();
                double b = scn.nextDouble();
 double avrg = (a+b+x+y+z)/5;
 if (avrg>=90 && avrg<=100){
    System.out.println("A you are topper dude leave this place ");
 }
else if ( avrg >=75){
    System.out.println("B great you can do more ");
}
else if ( avrg >= 65){
    System.out.println("C do study bruhh");
}
else if ( avrg >= 36){
System.out.println("D you are just at a border ");
}
else if ( avrg >= 0){
    System.err.println("fail just leave study bruhh");
}
else {
    System.out.println("enter right nuber nigga!! ");
}

    }
}
