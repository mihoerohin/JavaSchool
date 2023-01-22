package day00_GroupClass.task_07;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_FrequencyOfCharacters {

//    Map - Frequency of Characters
//    Write a method that prints the frequency of each character from a String

    public static void main(String[] args) {

        String str = "package day00_GroupClass.task_07;import java.util.TreeMap;";

        frequencyOfEachCharacter(str);

        Map<Character, Integer> map = new HashMap<>(frequencyCharMap(str));

        System.out.println(map);

    }
    public static void frequencyOfEachCharacter(String str){

        Map<String, Integer> map = new TreeMap<>(); // TreeMap => remove duplicate KEY and sorted KEY

        for (int i = 0; i < str.length(); i++) {

            String temp  = str.charAt(i) + "";

            if (map.containsKey(temp)){
                map.put(temp, map.get(temp) + 1);
            }else{
                map.put(temp, 1);
            }
        }
        System.out.println(map);
    }

    public static Map<Character, Integer> frequencyCharMap(String str){

        Map<Character, Integer> map = new TreeMap<>(); // TreeMap => remove duplicate KEY and sorted KEY

        for (int i = 0; i < str.length(); i++) {

            char temp = str.charAt(i);

            if (map.containsKey(temp)){
                map.put(temp, map.get(temp) + 1);
            }else{
                map.put(temp, 1);
            }
        }
       return map;
    }
}
