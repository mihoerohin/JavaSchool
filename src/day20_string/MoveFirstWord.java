package day20_string;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Given a sentence. Display the sentence with the first word moved to the end of the sentence.
        //Ex:
        //Input: Java is a fun language
        //Output: is a fun language Java
        //Hint: Use indexOf and substring
        System.out.println("Enter any sentence");
        String sentence = input.nextLine().trim();

        int spaceIndex = sentence.indexOf(' '); // (" ")

        String firstWord = sentence.substring(0, spaceIndex);

        sentence += firstWord;

        String result = sentence.substring(spaceIndex + 1) + " " + firstWord;

        System.out.println(result);


    }
}
