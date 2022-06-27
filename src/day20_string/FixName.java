package day20_string;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
         String firstName = input.next();
        System.out.println("Enter your last name");
         String lastName = input.next();

        firstName = firstName.trim().toLowerCase();
        lastName = lastName.trim().toLowerCase();

        String fixFirst = firstName.substring(0, 1).toUpperCase();
        fixFirst += firstName.substring(1);
        String fixLast = lastName.substring(0, 1).toUpperCase();
        fixLast += lastName.substring(1);



        System.out.println(fixFirst + " " + fixLast);




    }
}
