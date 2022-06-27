package day20_string;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Given a String, write a program to display the middle character of a string
        //  a) If the length of the string is even there will be two middle characters.
        //  b) If the length of the
        //  string is odd there will be one middle character.
        //Ex:
        //Input: elephant
        //Output: The middle characters: ph
        System.out.println("Entre your word");
        String word = input.next();

        String word1 = word.substring(word.length() / 2);
        String word2 = word.substring((word.length() - 1) / 2);   

        if (word.length() % 2 != 0) {
            System.out.println("The middle characters: " + word1.substring(0, 1));

        }else if (word.length() % 2 == 0) {
            System.out.println("The middle characters: " + word2.substring(0, 2));

        }
    }
}
