package day57_exceptions.learn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter a number");
            int num1 = input.nextInt();

            System.out.println("Enter number 2");
            int num2 = input.nextInt();

            System.out.println("Result ==> " + num1/num2);

        }catch (InputMismatchException obj){
            obj.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("FINALLY BLOCK");
            input.close();
        }
        System.out.println("DONE");
    }
}
