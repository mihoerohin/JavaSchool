package day19_string;

import java.util.Locale;

public class IndexMethod2 {
    public static void main(String[] args) {

        String s = "java";
        System.out.println(s.indexOf('d'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println("#" + s.indexOf('v'));
        System.out.println(s.lastIndexOf('v'));
        System.out.println(s.indexOf('w'));
        System.out.println(s.lastIndexOf('p'));

        String s2 = "abcbcb";
        System.out.println(s2.indexOf('b'));
        System.out.println(s2.lastIndexOf('b'));

        System.out.println("@@" + s2.indexOf("cb"));

         String str = "12breadjambread";
        System.out.println(str.substring(5, 10));

        System.out.println(str.lastIndexOf("bread"));



        System.out.println(str.substring((str.indexOf("bread") + 5), (str.lastIndexOf("bread"))));

        //if(str.substring(str.indexOf("bread"), str.lastIndexOf("bread"))){


    }
}
