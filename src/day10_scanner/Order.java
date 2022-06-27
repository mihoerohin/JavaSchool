package day10_scanner;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pleas enter the product name:");
        String productName = input.nextLine();
        System.out.println("Pleas enter the price of the " + productName);
        double price = input.nextDouble();
        System.out.println("How many " + price + "'s do you want to buy");
        int quantity = input.nextInt();

        input.nextLine();      // grab extra space input from above line

        System.out.println("What is the full name for the product");
        String fullName = input.nextLine();
        double totalCost = price * quantity;

        String order = fullName + " your order for " + quantity + " " + productName + " has been placed. Your total is $" + totalCost;



    }
}
