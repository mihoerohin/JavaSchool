package day00_my_school;

import java.util.Scanner;

public class BiggestWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }
        //WRITE YOUR CODE BELOW

        String biggest = "";

        for(int s = 0; s < words.length; s++){
            if(words[s].length() > biggest.length()){
                biggest = words[s];
            }
        }
        System.out.println(biggest);
    }


}
