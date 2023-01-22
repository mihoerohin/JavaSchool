package day00_GroupClass.task_01;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "AAABBBBCCCCDDDEFFFF";

        System.out.println(removeDubLetters(s));
        System.out.println(removeDubLetters(" public static void main(String[] args)"));
    }

    public static String removeDubLetters(String str){

        Set<String> setOfChar = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            setOfChar.add(str.charAt(i)+"");
        }
        String s = String.join("", setOfChar);

        return s;

    }


}
