package exercise2;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double c = Math.PI * r * 2;
        double a = Math.PI * r * r;
        System.out.println("Circumference: " + c);
        System.out.println("Area: " + a);
    }
}


