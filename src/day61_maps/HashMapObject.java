package day61_maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapObject {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(3,"three");
        map.put(10,"ten");  // key exists  ===> value get update (ten to null)
        map.put(5, "five");
        map.put(4, "five");
        map.put(7, "seven");
        map.put(10, "not null"); // to give new value for same key 10
        map.put(2, "two");
        map.put(99, "cents");
        map.put(null, null);

        System.out.println(map); //HashMap element order is random, not insertion order

        System.out.println(map.get(10)); // argument is the key, not index
        System.out.println("11111 "+map.values());

        String value = map.get(1);

        map.remove(9);

        System.out.println(map);

        System.out.println("map.containsKey 2?  " + map.containsKey(2));     // boolean  true
        System.out.println("map.containsKey 12?  " + map.containsKey(12));    // boolean  false

        System.out.println("map.containsValue cents?  " + map.containsValue("cents"));  // boolean  true
        System.out.println("map.containsValue LOL?  " + map.containsValue("LOL"));    // boolean  false

    }
}
