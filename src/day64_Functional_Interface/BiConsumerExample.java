package day64_Functional_Interface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {

        BiConsumer<String, Integer> printNTimes = (str, n) -> {

            for (int i = 0; i < n; i++) {
                System.out.println(str + " ");
            }
            System.out.println();
        };
        printNTimes.accept("java", 2);
        printNTimes.accept("Selenium", 3);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Map<String,Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("tree", 3);

        map.forEach((key, value)->{
            System.out.println(key + " " + value);
        });

        map.forEach((key, value) -> {
            System.out.println(value + " letters length " + key.length());
        });

        map.forEach((key, value)->{
            System.out.println("sum value(int) and key.length() " + value + key.length());
        });

    }
}
