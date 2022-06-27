package day10_scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //popular name of Scanner: scan, input, scanner, keyboard.

        System.out.println("Enter the price of the item");
        double price = scan.nextDouble();

        System.out.println("Enter the quantity");
        double quantity = scan.nextDouble();

        double revenue = price * quantity;

        System.out.println("Revenue: $" + revenue);
                            //or
       // System.out.println("the revenue is " + (scan.nextDouble() * scan.next()));

    }
}
