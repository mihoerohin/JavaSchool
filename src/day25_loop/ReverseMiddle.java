package day25_loop;

import java.util.Scanner;

public class ReverseMiddle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 words");
        String str = input.nextLine().trim();

        int firstSpace = str.indexOf(" ");
        int lastSpace = str.lastIndexOf(" ");

        String middleWord = str.substring(firstSpace + 1, lastSpace);
        String revers = "";

        for(int i = middleWord.length() - 1; i >= 0; i--){
            revers += middleWord.charAt(i);
        }
        System.out.println(str.substring(0, firstSpace + 1) + revers + str.substring(lastSpace));
    }
}
