package day19_string;

import java.util.Scanner;

public class CharMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = "java";
        // index = "0123";
        System.out.println(s.length());

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
        

        int lastIndex = s.length() - 1; // 4 - 1 = 3
        System.out.println("last char: " + s.charAt(lastIndex)); // this is the same as line 13, but line 13 is hardcoded

        int secondToLastIndex = s.length() - 2; //this is the same line 12
        char secondToLastChar = s.charAt(secondToLastIndex);
        System.out.println("second to last char: " + secondToLastChar);

      String word = "Misha";

        System.out.println("" + (word.charAt(2)) + (word.charAt(1)));


    }
}
