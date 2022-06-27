package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

                        /// show me element from ArrayList, count char  ex: 3 = one, 4 = five, four  5 = three
public class RemoveLongString {
    public static ArrayList<String> keepLongString(ArrayList<String> list, int maxLength){

        list.removeIf(word ->word.length() < maxLength);

        return list;

    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("one", "two","three","four","five", "six"));

        System.out.println(keepLongString(words, 5));
    }
}
