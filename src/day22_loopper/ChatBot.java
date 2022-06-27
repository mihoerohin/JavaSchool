package day22_loopper;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean keepTalking = true;

        while(keepTalking){

            System.out.println("Enter any word");
            String msg = input.nextLine().toLowerCase();

            switch (msg){

                case "hello":
                    System.out.println("Hi");
                    break;
                case "how are you":
                    System.out.println("Im good");
                    break;
                case "bay":
                    System.out.println("No, don't leave");
                    keepTalking = false;
                    break;
                default:
                    System.out.println("I don't know what you siad");



            }

        }
    }
}
