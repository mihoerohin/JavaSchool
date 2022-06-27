package day11_if_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nWhat is your balance:");
        double balance = input.nextDouble();
        
        System.out.println("How match you withdrawal:");
        double withdrawal = input.nextDouble();


        double balanceAfter = balance - withdrawal;


        boolean fee = (0 > balanceAfter);
        if(fee){
            System.out.println("Fee $30");
        }

        balanceAfter -=30;

        if(balance < 0){
            System.out.println("true");
            balanceAfter -= 30;
        }


        System.out.println("Balance: $" + balanceAfter);


    }
}
