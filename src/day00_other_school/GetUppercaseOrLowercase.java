package day00_other_school;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class GetUppercaseOrLowercase {
    public static void main(String[] args) {

        String str = "HelloWorLD";

        ArrayList<Character> lis1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == str.toLowerCase(Locale.ROOT).charAt(i)){
                lis1.add(str.charAt(i));
            } else{
                list2.add(str.charAt(i));
            }

        }

        System.out.println(lis1);
        System.out.println(list2);

    }
}
