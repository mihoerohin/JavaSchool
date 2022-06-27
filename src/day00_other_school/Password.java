package day00_other_school;

import java.util.Locale;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String pass = input.nextLine().toLowerCase();

         boolean value = Character.isDigit(pass.charAt(0)) &&
                 pass.length() > 3 &&
                 pass.length() < 16 &&
                 Character.isLetter(pass.charAt(pass.length() - 1));

        System.out.println(value);
    }
}
