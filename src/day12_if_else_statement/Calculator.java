package day12_if_else_statement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         //- do it without Scanner
        //
        //declare and assign 2 number variables
        //declare and assign a char variable for an operator
        //
        //create a calculator based on the operator picked
        //	+ : add num1 and num2
        //	- : minus num1 and num2
        //	* : multiply num1 and num2
        //	/ : divide num1 and num2
        //	any other char: "invalid operator"
        // if(letter >= 97 && letter <= 122) ==> lowercase

        double num1 = 100, num2 = 9;
        char num3 = 'e';



        if (num3 == num1 + num2){
            System.out.println(num3);
        }else if(num3 == num1 - num2){
            System.out.println(num3);
        }else if(num3 == num1 * num2){
            System.out.println(num3);
        }else if(num3 == num1 / num2){
            System.out.println(num3);
        }else{
            System.out.println("invalid operator");
        }


    }
}
