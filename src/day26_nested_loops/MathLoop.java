package day26_nested_loops;

import day16_switch.SoccerGame;

public class MathLoop {
    public static void main(String[] args) {


        for(int num1 = 1; num1 <= 10; num1++) {
            System.out.print(1 + " x " + num1 + " = " + (1 * num1));
        }

        System.out.println("------------------------------------------");

        for(int num2 = 1; num2 <= 10; num2++){
            System.out.println(num2 + " x " + num2 + " = " + (num2 * num2));
           
        }
        
        System.out.println("-----------------------------------");
            for(int num = 1; num <= 10; num++){

                for(int multi = 1; multi <= 15; multi++){

                    System.out.print(num + " * " + multi + " = " + (num * multi) + " | ");
                }
                System.out.println();

            }
    }
}
