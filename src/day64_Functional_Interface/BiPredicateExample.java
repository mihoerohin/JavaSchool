package day64_Functional_Interface;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {

        BiPredicate<Integer[], Integer> contains = (arr, num) -> {

            for (int each : arr) {
                if (each == num){
                    return true;
                }
            }
            return false;
        };

        Integer[] arr = {3,34,54,47,35435,99};
        System.out.println(contains.test(arr,24));  // false
        System.out.println(contains.test(arr, 99));  // true

        Integer[] arr2 = {3,1,4,5,2,6,3,33,55};
        System.out.println(Arrays.asList(arr2));







    }
}
