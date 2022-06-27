package day14_if_statements;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("**** Welcome to ATM ****\nPlease Enter your card and than type your pin code");
        int pinCode = input.nextInt();
        int expectedPin = 1234;

        if (pinCode == expectedPin){
            System.out.println("Logged in");
            System.out.println("select a number");
            System.out.println("\t1) Check balance");
            System.out.println("\t2) Withdraw");
            System.out.println("\t3) Deposit");
            System.out.println("\t4) Cancel");
            int option = input.nextInt();

            if(option == 1){
                System.out.println("Your balance is: $" + 200_000);
            }else if(option == 2){
                System.out.println("How mach do you want to withdraw?");
                double money = input.nextInt();
                System.out.println("Withdraw $" + money);
            }else if(option == 3){
                System.out.println("Please deposit the money");
            }else if(option == 4){
                System.out.println("Cancel ");
            }else{
                System.out.println("bay bay");
            }



        }else{
            System.out.println("Invalid pin, please try again");
        }



    }
}
