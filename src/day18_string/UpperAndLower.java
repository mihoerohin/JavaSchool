package day18_string;

import java.util.Locale;

public class UpperAndLower {
    public static void main(String[] args) {

        String str = "sNOw";
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str);

        String word = "hello";
        String word2 = word + " WORLD";
        System.out.println(word2);

        word += " next text";
        System.out.println(word);

        String old = "mark";
        String newValue = old.toUpperCase();
        System.out.println(newValue);
        System.out.println(old);



    }
}
