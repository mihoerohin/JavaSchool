package day23_loops;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int secretNumber = 80;
        int guess;

        do{

            System.out.println("Guess a number from 1-200");
            guess = input.nextInt();

            if(guess > secretNumber){
                System.out.println(guess + " is too high");

            }else if(guess < secretNumber){
                System.out.println(guess + " is to low");
            }

        }while(guess != secretNumber);

        System.out.println("You guess number " + secretNumber);



    }
}
