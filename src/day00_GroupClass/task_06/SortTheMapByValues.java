package day00_GroupClass.task_06;

import java.util.*;

public class SortTheMapByValues {
//    Map - Sort the map by values
//    Write a method that can sort the Map by values

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>(); // LinkedHashMap => add same order
        map.put("Java", 90);
        map.put("Selenium", 23);
        map.put("Cucumber", 19);
        map.put("Dog", 112);
        map.put("Cat", 1);
        System.out.println(map); // {Java=90, Selenium=23, Cucumber=19, Dog=112, Cat=1}

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        ArrayList<Integer> list = new ArrayList<>(map.values());
        SortingInAscending.SortNums(list);
        System.out.println(list); // [1, 19, 23, 90, 112]


        Map<String, Integer> sortValue = new LinkedHashMap<>();

        for (int each : list){
            for(String str : map.keySet()) {
                if (each == map.get(str)){
                    sortValue.put(str, each);
                }
            }
        }
        System.out.println(sortValue); // {Cat=1, Cucumber=19, Selenium=23, Java=90, Dog=112}

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        ArrayList<Integer> list2 = new ArrayList<>(map.values());
        SortingInDescendingOrder.SortNumRevers(list2);
        System.out.println(list2); // [112, 90, 23, 19, 1] revers

        Map<String, Integer> sortValueRevers = new LinkedHashMap<>();

        for (int each : list2){
            for(String str : map.keySet()) {
                if (each == map.get(str)){
                    sortValueRevers.put(str, each);
                }
            }
        }
        System.out.println(sortValueRevers);

    }
}
