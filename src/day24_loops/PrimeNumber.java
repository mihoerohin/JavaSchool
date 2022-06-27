package day24_loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        boolean isPrime = true;

        for(int i = 2; i <number; i++){

            if(number % i == 0){
               isPrime =false;
               break;
            }
        }
        if(isPrime) {
            System.out.println(number + " is prime");
        }else{
            System.out.println(number + " is NOT prime");
        }
    }
}
