package day20_string;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any two words");
        String word1 = input.next();
        String word2 = input.next();

        // Given two words. Print the first word without its first character then print the second word
        //without its last character.
        //Input:
        //apple banana
        //Output:
        //pple
        //banan
         //String website = url.substring(4, url.length() - 4);


        System.out.println(word1.substring(1));     //pple
        System.out.println(word2.substring(word2.length() - 1));    //banan


    }
}
