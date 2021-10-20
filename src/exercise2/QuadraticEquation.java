package exercise2;
import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] string = new String [input.nextInt()];
        double a = Double.parseDouble(string[0]);
        double b = Double.parseDouble(string[1]);
        double c = Double.parseDouble(string[2]);
        if(a!=0){
            double D = b * b - 4 * a * c;
            if(D>=0){
                double x1 = (-b + Math.sqrt(D))/2*a;
                double x2 = (-b - Math.sqrt(D))/2*a;
                System.out.println(x1 + ", " + x2);
            }
            else{
                System.out.println("Imaginary values");
            }
        }
        else if(b!=0){
            double x = -c / b;
        }
        else if(c!=0){
            System.out.println("No values");
        }
        else{
            System.out.println("Many values");
        }
    }
}
