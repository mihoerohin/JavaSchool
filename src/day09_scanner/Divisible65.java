package day09_scanner;

import java.util.Scanner;

public class Divisible65 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");

        double number = input.nextDouble();

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        double result1 = number / number1;
        double result2 = number / number2;
        double result3 = number / number3;

        boolean total1 = number % number1 == 0;
        boolean total2 = number % number2 == 0;
        boolean total3 = number % number3 == 0;

        System.out.println( number + " is divisible by " + number1 + " result " + result1 + " --> " + total1);
        System.out.println( number + " is divisible by " + number2 + " result " + result2 + " --> " + total2);
        System.out.println( number + " is divisible by " + number3 + " result " + result3 + " --> " + total3);


        
    }
}
