package day00_other_school;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SeparateParts {
    public static void main(String[] args) {

        String xx = "ABCD0123$%#@&456EFG!";

        ArrayList<Character> all = new ArrayList<>();

        for (int i = 0; i < xx.length(); i++) {
            all.add(xx.charAt(i));
        }

        System.out.println(all);
        Collections.sort(all);
        System.out.println(all);

        System.out.println("===========================================");

        ArrayList<Character> charOne = new ArrayList<>();

        ArrayList<Character> num2 = new ArrayList<>();


        ArrayList<String> nums = new ArrayList<>();
        nums.retainAll(Arrays.asList("0", "1","2","3","4","5","6","7","8","9"));


        ArrayList<String> charS = new ArrayList<>();
        charS.retainAll(Arrays.asList("!", "@","#","%","^","&","*","(",")",","));


        for (int i = 0; i < xx.length(); i++) {
            for (char q = 'A'; q <= 'Z'; q++) {
               if(xx.charAt(i) == q){
                   charOne.add(xx.charAt(i));
               }
            }
        }

        System.out.println(charOne);


        for (int i = 0; i < xx.length(); i++) {

            for (char q = '0'; q <= '9'; q++) {
                if(xx.charAt(i) == q){

                    num2.add(xx.charAt(i));
                }
            }
        }
        System.out.println(num2);

        ArrayList<Character> lastChar = new ArrayList<>(all);
         lastChar.removeAll(num2);
         lastChar.removeAll(charOne);
        System.out.println(lastChar);

    }
}
