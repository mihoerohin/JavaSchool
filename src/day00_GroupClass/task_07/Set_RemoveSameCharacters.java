package day00_GroupClass.task_07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set_RemoveSameCharacters {

    public static void main(String[] args) {

        String s = "aaaaaaaaaaaaaaabbbbbbbbbbccccccccccddddddeeee";
        System.out.println(new HashSet<>(Arrays.asList(s.split("")))
                .toString()
                .replace(", ","")
                .replace(" [","")
                .replace("] ",""));

        Set<String> unique = new HashSet<>(Arrays.asList(s.split("")));
        System.out.println(unique);  // [a, b, c, d, e]
        System.out.println( unique.toString().replace(", ", "")); // [abcde]
        System.out.println( unique.toString().replace(", ", "---")); // [a---b---c---d---e]


    }
}
