package day00_my_school;

import java.util.Scanner;

public class CharAeOiU {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        String char1 = "";

        char charA = 'a';
        char charO = 'o';
        char charI = 'i';
        char charU = 'u';
        char charE = 'e';


        for(int i = 0; i <= word.length() - 1; i++){

            charA += word.charAt(i);
            charI += word.charAt(i);
            charO += word.charAt(i);
            charU  += word.charAt(i);
            charE  += word.charAt(i);
            
            System.out.print(word.charAt(i));
        }





    }

}