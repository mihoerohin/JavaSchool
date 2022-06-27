package day61_maps;

import day00_other_school.Map_one;

import java.util.*;

public class AllMapObjects {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        map.put("saim", "java");
        map.put("hello", "world");
        map.put("james", "bond");
        map.put("aysun", "ui testing");
        map.put("nadir", "soft skills");
        map.put("username", "password1");
        map.put(null, "nothing");
        map.put("username", "password2");
        map.put("username", "password3");
        map.put("nothing", null);
        System.out.println(map);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Map<String, String> linked = new LinkedHashMap<>();
        linked.put("saim", "java");
        linked.put("hello", "world");
        linked.put("james", "bond");
        linked.put("aysun", "ui testing");
        linked.put("nadir", "soft skills");
        linked.put("username", "password");
        linked.put(null, "nothing");
        System.out.println(linked);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("saim", "java");
        treeMap.put("hello", "world");
        treeMap.put("james", "bond");
        treeMap.put("aysun", "ui testing");
        treeMap.put("nadir", "soft skills");
        treeMap.put("username", "password");
      //  treeMap.put(null, "nothing"); ThreeMap objects cannot have null KEY
        System.out.println(treeMap);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Map<String, String> hashtable = new Hashtable<>();
        hashtable.put("saim", "java");
        hashtable.put("hello", "world");
        hashtable.put("james", "bond");
        hashtable.put("aysun", "ui testing");
        hashtable.put("nadir", "soft skills");
        hashtable.put("username", "password");
         //  hashtable.put(null, "nothing");   Hashtable objects cannot have null KEY and VALUE
        System.out.println(hashtable);






    }
}
