package day37_methods_arraylist;

import java.util.Scanner;

public class ParseYear {
    public static void main(String[] args) {

        String year = "2022";

        System.out.println("this year " + year);
        System.out.println("Next year will be " + (year + 1));
        System.out.println();

        int numYear = Integer.parseInt(year);

        System.out.println("this year " + numYear);
        System.out.println("Next year will be " + (numYear + 1));
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message: I am x years old");
        String str = input.nextLine();

        String agePart = str.split(" ")[2];
        int age = Integer.parseInt(agePart);
        System.out.println("In five year, you will be " + (age + 5));




    }
}
