package day00_my_school;

import java.util.Scanner;

public class IndexAndSubstring {
    public static void main(String[] args) {

        String str = "mishsaamiha";
        //            12345678910
        int n = 4;


        String word = str.substring(0, n);
        String word2 = str.substring(n);
      


     

        if(word2.contains(word)){
            System.out.println("true");

        }else {
            System.out.println("false");

        }
        
    }
}
