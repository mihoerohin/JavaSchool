package day14_if_statements;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------\nEnter PIN");
        int expectedPin = input.nextInt();
        System.out.println("Enter SSN");
        int expectedSSN = input.nextInt();

        if(expectedPin == 1234 && expectedSSN == 5678){
            System.out.println("-----------------------------\nAuthentication successful\n-----------------------------");

        }else{
            System.out.println("-----------------------------\nAuthentication failed\n-----------------------------");
            if(expectedPin != 1234){
                System.out.println("incorrect pin code");
            }if(expectedSSN != 5678){
                System.out.println("invalid SSN");

            }
            System.out.println("----------------------------");
        }

    }
}
