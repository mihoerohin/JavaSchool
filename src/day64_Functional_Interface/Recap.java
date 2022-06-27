package day64_Functional_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Recap {
    public static void main(String[] args) {

        Predicate<Integer> verifyDuplicates = n -> {
            String str = n + "";
            String uniques = "";

            for (int i = 0; i < str.length(); i++) {
                if (!uniques.contains(str.charAt(i) + "")) {
                    uniques += str.charAt(i);

                } else {
                    return true;
                }
            }
            return false;
        };
        System.out.println(verifyDuplicates.test(1234));
        System.out.println(verifyDuplicates.test(1231));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        //         parameter  return type
        Function <List<String>, String> longestStringFromList = (list) -> {
            String longest = "";
            for(String each : list){
                if(each.length() > longest.length()){
                    longest = each;
                }
            }
            return longest;
        };

        System.out.println(longestStringFromList.apply(new ArrayList<>(Arrays.asList("Hello", "World", "Java", "Selenium", "really long word"))));




    }
}
