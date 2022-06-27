package day34_methods;

import java.util.Scanner;

public class NumberWords {


    public static void main(String[] args) {

        System.out.println(numberAsWord(3));
        System.out.println(numberAsWord(10));
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        System.out.println(numberAsWord(input.nextInt()));

    }

    public static String numberAsWord(int num){

        String [] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        return words [num - 1];

    }
}
