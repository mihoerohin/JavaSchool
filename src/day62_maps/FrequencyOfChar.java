package day62_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfChar {
    public static void main(String[] args) {

        CounterChar("public static void main(String[] args) {");
    }
    public static void CounterChar(String str){

        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if (map.containsKey(letter)) {
                map.put(letter, map.get(letter)+1);

            } else {
                map.put(letter, 1);
            }
        }
        System.out.println(map);
    }
}
