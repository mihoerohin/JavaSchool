package day12_if_else_statement;

import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        int month = input.nextInt();
        
        boolean has31Days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||  month == 10 || month == 12;

        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;

        boolean has28Days = month == 2;

    /*    if (has31Days) {
            System.out.println("31 Days");
        }

        if (has30Days) {
            System.out.println("30 Days");
        }

        if (has28Days){
            System.out.println("28 Days");
        }
        */


        if (has31Days) {
            System.out.println("31 Days");
        } else if (has30Days) {
            System.out.println("30 Days");
        } else if (has28Days){
            System.out.println("28 Days");
        } else {
            System.out.println("Invalid number for month");
        }




    }
}
