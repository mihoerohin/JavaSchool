package day12_if_else_statement;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 3 numbers, use enter after each:");

        int size1 = input.nextInt(), size2 = input.nextInt(), size3 = input.nextInt();

        if (size1 >= size2 && size1 >= size3){
            System.out.println("Biggest #1 ==> " + size1);
        }else if(size2 >= size1 && size2 >= size3){
            System.out.println("Biggest #2 ==> " + size2);
        }else{
            System.out.println("Biggest #3 ==> " + size3);
        }
    }
}
