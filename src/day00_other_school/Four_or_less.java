package day00_other_school;

import java.util.ArrayList;

public class Four_or_less {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("java");
        words.add("html");
        words.add("cssVs");
        words.add("javaScript5555");
        words.add("javascript");
        words.add("selenium");
        words.add("lol");
        words.add("selenium2");
        ArrayList<String> xxx = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).length() <= 4){
               xxx.add(words.get(i));
            }


        }
        System.out.println(xxx);

    }
}
