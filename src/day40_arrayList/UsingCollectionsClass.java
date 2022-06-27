package day40_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollectionsClass {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,3,4,6,99,77,55,54));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('E','S','X','A','B','M','P','D','R','T'));
        System.out.println(letters);

        Collections.sort(letters);
        System.out.println(letters + " " + list);

        Collections.shuffle(letters);
        System.out.println(letters);
        Collections.sort(letters);
        System.out.println(letters);
        
        System.out.println("MAX " + Collections.max(list));
        System.out.println("MIN " + Collections.min(list));

        System.out.println(list);
        Collections.swap(list, 0, 6);
        System.out.println(list);
        System.out.println();
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(11, 24, 55, 22, 11, 43, 11));
        System.out.println("Number 11 repeat: " + Collections.frequency(nums,11));
        System.out.println();
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        ArrayList<String> words = new ArrayList<>(Arrays.asList("one", "two", "three", "one", "one"));
        System.out.println("word \'one\' repeat: " + Collections.frequency(words, "one"));

    }
}
