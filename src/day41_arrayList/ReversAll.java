package day41_arrayList;

import day40_arrayList.ArrayListWithMethods;
import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class ReversAll {

    public static ArrayList<String> reverseAll(ArrayList<String> list) {

        ArrayList<String> reverseWord = new ArrayList<>();

        for (String each : list){
            reverseWord.add(StringUtil.reverse(each));

        }
        return reverseWord;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("lol","god","cat","boss"));
        System.out.println(reverseAll(list));

        System.out.println(reverseAll(ArrayListWithMethods.getDaysOfWeek()));

    }
}
