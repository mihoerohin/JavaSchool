package day24_loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine().trim();
        int spaces = 0;

        for(int i  = 0; i < str.length(); i++){

        if(str.charAt(i) == ' ') {
            spaces++;
        }

        }
        
        System.out.println("number of word: " + (spaces + 1));
    }
}
