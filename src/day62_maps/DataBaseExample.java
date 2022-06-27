package day62_maps;

import day55_polymorphism.interface_method.Mac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseExample {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("FIRST_NAME", "James");
        map.put("LAST_NAME", "Bond");
        map.put("BATCH", "007");

        System.out.println(map);

        List< Map<String, String>> list = new ArrayList<>();
        list.add(map);
        list.add(makeMap("Shina", null, "23"));

        System.out.println(list.get(0).get("FIRST_NAME"));
        System.out.println(list.get(0).get("LAST_NAME"));



    }
    public static Map<String, String> makeMap (String ... values) {

        Map<String, String> map = new HashMap<>();

        map.put("FIRST_NAME", values[0]);
        map.put("LAST_NAME", values[1]);
        map.put("BATCH", values[2]);


        return map;
    }


}
