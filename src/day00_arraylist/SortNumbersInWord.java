package day00_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SortNumbersInWord {
    public static void SortNumbersInWords(String str){

        ArrayList<String> words = new ArrayList<>(Arrays.asList(str.split(" ")));
        ArrayList<String> result = new ArrayList<>(Arrays.asList(str.split(" ")));

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);

            for (char j = '1'; j <= '9'; j++) {
                if(word.indexOf(j)>-1){

                    int x = Character.getNumericValue(j);
                    result.set(x-1, word);
                }
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        SortNumbersInWords("4of Fo1r peo6ple g3ood the5 th2e");
    }

}
