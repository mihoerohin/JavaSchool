package day00_GroupClass.task_07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_FindUniqueCharacter {

//    Map - find unique character from String

    public static void main(String[] args) {

        String str = "aabbbccXYZ";

        uniqueCharacter(str);


    }

    public static void uniqueCharacter(String str){

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char temp = str.charAt(i);

            if (map.containsKey(temp)){
                map.put(temp, map.get(temp) + 1);
            }else{
                map.put(temp, 1);
            }
        }


        Map<Character, String> map1 = new LinkedHashMap<>();

        for (char x : map.keySet()){
            if(map.get(x) == 1){
                map1.put(x, "unique");
           }
        }

        System.out.println(map1);
    }
}
