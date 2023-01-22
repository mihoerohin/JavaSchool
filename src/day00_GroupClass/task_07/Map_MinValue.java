package day00_GroupClass.task_07;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_MinValue {

//    Map - Min value
//    Write a method that can return the minimum value from ta map (DO NOT use sort method)

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Junit", 14);
        map.put("Java", 90);
        map.put("Selenium", 23);
        map.put("Cucumber", 1);
        map.put("Dog", -112);
        map.put("Cat", 12);

        System.out.println("minValueNumber(map) = " + minValueNumber(map));

    }
    public static Map<String, Integer> minValueNumber(Map<String, Integer> map){

        Map<String, Integer> minValueNum = new HashMap<>();

        int value = Integer.MAX_VALUE;

        for(String key : map.keySet()){

            if (map.get(key) < value){

                value = map.get(key);

                minValueNum.clear();

                minValueNum.put(key, value);
            }
        }
        return minValueNum;
    }
}
