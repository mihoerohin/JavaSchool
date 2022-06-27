package day00_other_school;

import java.util.ArrayList;

public class parens {
    public static void main(String[] args) {

        ArrayList<Character> xx = new ArrayList<>();
        String pp = "()(2(3)43))3((42)))";


        for (int i = 0; i < pp.length(); i++) {
            if(pp.charAt(i) == '(' || pp.charAt(i) == ')'){
                xx.add(pp.charAt(i));
            }
        }
        System.out.println(xx);




        for (int i = 0; i <= xx.size(); i++) {
            

        }
        
    }
}
