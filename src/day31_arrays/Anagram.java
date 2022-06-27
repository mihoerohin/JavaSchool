package day31_arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {


        String str = "listen";
        String str2 = "silent";
        String word = "";

        char [] one = str.toCharArray();
        char [] two = str2.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));

        if(Arrays.equals(one, two)){
            System.out.println("anagram");

        }   else {
            System.out.println("not anagram");
        }

        System.out.println(Arrays.equals(one, two) ? "anagram2" : "not anagram2");



    }
}
