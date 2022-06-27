package day09_scanner;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("numbers 1");
        int num1 = input.nextInt();
        System.out.println("numbers 2");
        int num2 = input.nextInt();
        System.out.println("numbers 3");
        int num3 = input.nextInt();
        System.out.println("Print the sum of numbers " + (num1 + num2 + num3));


    }
}
