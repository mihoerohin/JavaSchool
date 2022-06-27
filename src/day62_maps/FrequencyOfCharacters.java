package day62_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        frequencyOfCharacters("public static void main(String[] args) {");

    }
    public static void frequencyOfCharacters (String str){

        Map<Character, Integer> counter = new LinkedHashMap<>(); //{p=1, u=1, b=1, l=1, i=5, c=2,  =5, s=2, t=3, a=3, v=1, o=1, d=1, m=1, n=2, (=1, S=1, r=2, g=2, [=1, ]=1, )=1, {=1}
       // Map<Character, Integer> counter = new TreeMap<>(); //{ =5, (=1, )=1, S=1, [=1, ]=1, a=3, b=1, c=2, d=1, g=2, i=5, l=1, m=1, n=2, o=1, p=1, r=2, s=2, t=3, u=1, v=1, {=1}

        for(int i = 0; i < str.length(); i++){

            char key = str.charAt(i);

            if(counter.containsKey(key)){
                // the letter/char was found before, this is a duplicate occurrence, so we will need to update the counter for it, which is the value in our map

                counter.put(key, counter.get(key) + 1); // counter.get() the method from the map to get the value of the previous counter, then we add 1 to that number, then assigns that result as the new value linked to that key

            } else {
                // the map does not contain the letter/char -> which means this is the first time the character was found, so we should add it to the map

                counter.put(key, 1);
            }

        }

        System.out.println(counter);

    }

}
