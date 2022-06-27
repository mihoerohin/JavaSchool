package day13_if_statement;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        System.out.println("Enter number: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();

        if (num1 % 3 == 0){
            System.out.println("Fizz");
        } else if(num1 % 5 == 0) {
            System.out.println("Buzz");
        } else if(num1 % 3 == 0 && num1 % 5 == 0) {
            System.out.println("Fizz Buzz");
        } else {
            System.out.println("False");
        }


        
    }
}
