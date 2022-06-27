package day15_switch;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to vending machine.\nPlease select one of the following:\n\tDrinks\n\tSnacks\n\tGums");
        String selection = input.next();
        String item = "";

        switch (selection){

            case "Drinks":
            case "drinks":
            case "drink":
            case "Drink":
                System.out.println("You choose drinks: press a number:\n\t1) Water\n\t2) Soda\n\t3) Juice");
                int drinkNumber = input.nextInt();
                if (drinkNumber == 1){
                    item = "Your choose: Water";
                }else if(drinkNumber == 2){
                    item = "Your choose: Soda";
                }else if(drinkNumber == 3){
                    item = "Your choose: Juice";
                }else{
                    System.out.println("Incorrect, try again numbers 1, 2 or 3");
                }
                System.out.println(item);
                break;

            case "Snacks":
            case "snacks":
            case "snack":
            case "Snack":
                System.out.println("You choose snacks: press a number:\n\t4) Cookies\n\t5) Chips\n\t6) Pop corn");
                int snackNumber = input.nextInt();
                if(snackNumber == 4){
                    item = "Your choose: Cookies";
                }else if(snackNumber == 5){
                    item = "Your choose: Chips";
                }else if(snackNumber == 6){
                    item = "Your choose: Pop corn";
                }else{
                    System.out.println("Incorrect, try again numbers 4, 5 or 6");
                }
                System.out.println(item);
                break;

            case "Gums":
            case "Gum":
            case "gums":
            case "gum":
                System.out.println("You choose snacks: press a number:\n\t7) Boomer\n\t8) Dirol\n\t9) Orbit");
                int gumNumber = input.nextInt();
                if(gumNumber == 7){
                    item = "Your choose: Boomer";
                }else if(gumNumber == 8){
                    item = "Your choose: Dirol";
                }else if(gumNumber == 9){
                    item = "Your choose: Orbit";
                }else{
                    System.out.println("Incorrect, try again numbers 4, 5 or 6");
                }
                System.out.println(item);
                break;




        }


    }
}
