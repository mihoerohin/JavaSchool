package day09_scanner;

import java.util.Scanner;

public class AskUser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Ask the user to enter their age (byte),
        //ask them to enter their favorite number (long),
        //and ask them to enter their favorite book
        //Print all the values from the inputs
        input.nextLine();

        System.out.println("Enter their age:");
        byte age = input.nextByte();

        System.out.println("Favorite number:");
        long favoriteNum = input.nextLong();

        System.out.println("Favorite book:");
        String book = input.next();






    }
}
