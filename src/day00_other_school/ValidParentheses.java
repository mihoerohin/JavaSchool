package day00_other_school;

import java.util.Stack;

public class ValidParentheses {

    public static boolean validParentheses(String parens){

        boolean  a = true;
        String parenCount = "";


        for (int i = 0; i < parens.length(); i++) {

            if(parens.charAt(i) == ')' || parens.charAt(i) == '('){
                parenCount += parens.charAt(i);

            }
        }
       if(parenCount.length() > 0) {
           int b = 0;
           int f = 0;
           if (parenCount.charAt(0) == ')' && parenCount.charAt(parenCount.length() - 1) == '(') {
               a = false;
           }


           for (int i = 0; i < parenCount.length(); i++) {
               if (parenCount.charAt(i) == ')') {
                   b++;
               } else {
                   f++;
               }
           }

           if (b != f) {
               a = false;
           }


           
       }else {
           a = false;
       }

        return a ;
    }

    public static void main(String[] args) {
        
        System.out.println(validParentheses("1123123123"));

    }

}
