package day28_array;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Which month number do you want");
        int mon = input.nextInt();

        String[] month  = {"jan", "feb", "march", "april", "may", "june", "july", "august", "sept", "october", "nov", "december"};
        System.out.println(month[mon -1]);

    }
}
