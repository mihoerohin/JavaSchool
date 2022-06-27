package day00_other_school;

import java.util.ArrayList;
import java.util.Arrays;

public class Target_word {
    public static void main(String[] args) {
        
        ArrayList<String> words = new ArrayList<>();

        words.add("java");
        words.add("html");
        words.add("css");
        words.add("java");
        words.add("javascript");
        words.add("selenium");

        System.out.println(words);

        int s = 0;

        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).equals("java")){
                s++;

            }

        }


        System.out.println(s);
    }
}
