package day00_GroupClass.task_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SameLetters {
    public static void main(String[] args) {

        System.out.println(same("java", "aavj"));
        System.out.println(same("ja1va", "1aavj"));
        System.out.println(same("jav21a", "2aavj1"));

        System.out.println(same("world", "place"));
        System.out.println(same("ABCAD", "DABBC"));
        System.out.println(same("ABCAaD", "aDABBC"));
        System.out.println(same("ABCAaDs", "aDABBCs"));
    }


    public static boolean same(String word1, String word2) {

        boolean result = true;

        List<String> ss = new ArrayList<>(Arrays.asList(word1.split("")));
        Collections.sort(ss);
        List<String> ss2 = new ArrayList<>(Arrays.asList(word2.split("")));
        Collections.sort(ss2);

        if (word1.length() == word2.length()) {
            for (int j = 0; j < ss.size(); j++) {
                if (ss.get(j).equals(ss2.get(j))) {
                } else {
                    result=false;
                    break;
                }
            }

        }else {
            result=false;
        }
        return result;
    }
}