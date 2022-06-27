package day16_switch;

import java.util.Scanner;

public class CalculatorJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number one: ");
        double numOne = input.nextDouble();
        System.out.println("Pick operator: + - * / % ");
        String operator = input.next();
        System.out.println("Enter number two: ");
        double numTwo = input.nextDouble();

        double result = 0;
        boolean validCalculation = true;

        switch (operator){

            case "+":
            case "plus":
                result = numOne + numTwo;
                break;
            case "/":
                if (numTwo != 0) {
                    result = numOne / numTwo;
                }else{
                    System.out.println("Cannot divide by 0");
                    validCalculation = false;
                }
                break;
            case "-":
                result = numOne - numTwo;
                break;
            case "%":
                if(numTwo != 0) {
                    result = numOne % numTwo;
                }else{
                    System.out.println("Cannot take remainder of 0");
                    validCalculation = false;
                    }
                break;
            case "*":
            case "x":
                result = numOne * numTwo;
                break;
            default:
                System.out.println(operator + " is not a valid operators fo this calculator");
                validCalculation = false;
                break;


       }
        if (validCalculation) {
            System.out.println("---------------------------\n" + numOne + " " + operator + " " + numTwo + " = " + result);
        }
    }
}
