package day64_Functional_Interface;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunctionalExample {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> maxNumber = (one, two) -> {
            return  one > two ? one : two;
        };
        System.out.println(maxNumber.apply(5,6));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //               key          value      final map that will be return
        BiFunction <List<Integer>, List<String>, Map<Integer, String>> createMap = (keys, value) -> {
            Map<Integer, String> map = new HashMap<>();
            for (int i = 0; i < keys.size(); i++) {
                map.put(keys.get(i), value.get(i));
            }
            return map;
        };

        List<Integer> key = new ArrayList<>(Arrays.asList(1,23,5,4));
        List<String> value = new ArrayList<>(Arrays.asList("java", "selenium", "JUnit", "Jenkins"));

        System.out.println(createMap.apply(key, value));
    }

}
