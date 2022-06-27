package day24_loops;

import java.util.Locale;
import java.util.Scanner;

public class day25_createId {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter your first name");
        String firstName = input.next().toLowerCase().trim();
        System.out.println("Enter your last name");
        String lastName = input.next().toLowerCase().trim();

        String id = firstName.substring(0, 1);
        id += lastName.substring(0, 1).toUpperCase() + lastName.substring(1, 3);
        id += firstName.length() * 2;

        System.out.println(id);





    }
}
