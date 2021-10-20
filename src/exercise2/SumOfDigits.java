package exercise2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int st;
        int des;
        int ed;
        int sum = 0;
        if(number>=0&&number<=999){
            st = number/100;
            number%=100;
            des = number/10;
            number%=10;
            ed = number;
            sum = st + des + ed;
            System.out.println("Sum of digits: " + sum);
        }
        else {
            System.out.println("The number entered should be between 0 and 999!");
        }
    }
}
