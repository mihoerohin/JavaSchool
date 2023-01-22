package day00_GroupClass.task_01;

import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        System.out.println(FOChar2("AABCCDDE"));

        System.out.println(freqMap("public class FrequencyOfCharacters"));

    }


    public static Map<Character, Integer> freqMap  (String str){

        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {

            Character letter = str.charAt(i);

          if(map.containsKey(letter)){
              map.put(letter, map.get(letter) + 1);
          }else {
              map.put(letter, 1);
          }

        }

        return map;
    }




    public static String FOChar2(String word2) {

        String str = "";

        for (int i = 0; i < word2.length(); i++) {

            int a = 0;

            for (int j = 0; j < word2.length(); j++) {
                if (word2.charAt(j) == word2.charAt(i)) {
                    a++;
                }
            }
            str += word2.charAt(i) + "" + a;
            word2 = word2.replace("" + word2.charAt(i), "");
        }
        return str;
    }



}
