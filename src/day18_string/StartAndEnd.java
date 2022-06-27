package day18_string;

import java.util.Scanner;

public class StartAndEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        String str = "Apples";
        System.out.println(str.startsWith("App"));  // true
        System.out.println(str.startsWith("app"));   // false
        System.out.println(str.startsWith("Apples")); // true
        System.out.println(str.startsWith("pear"));  //false
        System.out.println(str.startsWith(" App"));  // false
        System.out.println(str.startsWith("Apple "));  // false
        System.out.println("*******************");

        String sentence = "hello world";
        System.out.println(sentence.startsWith("hello w"));  // true


        String s = "A";
        System.out.println(str.startsWith(s));  // true
        String t = "App";
        System.out.println(str.startsWith(t)); // true
        String w = "apples";
        System.out.println(str.startsWith(w)); // false

        System.out.println("*****************");

        String sentence1 = "It was a good day";
        System.out.println(sentence1.endsWith(" day"));   // true
        System.out.println(sentence1.endsWith("d day"));   // true
        System.out.println(sentence1.endsWith("good day"));   // true
        System.out.println(sentence1.endsWith("good"));   // false
        System.out.println(sentence1.endsWith(" it was a good"));   // false
        System.out.println(sentence1.endsWith("y"));   // true






    }
}
