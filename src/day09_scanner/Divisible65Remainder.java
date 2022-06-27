package day09_scanner;

import java.util.Scanner;

public class Divisible65Remainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = input.nextInt();

        boolean by2 = num % 2 == 0;
        boolean by3 = num % 3 == 0;
        boolean by5 = num % 5 == 0;

    }
}
