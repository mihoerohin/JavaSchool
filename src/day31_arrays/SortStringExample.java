package day31_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {

        String [] arr = {"java", "Hello", "$Dollar", "10bill", "1one", "101a", "120", "99cents", "10000P","4four", "five5", "Zebra", "SIX", "six"};
                 String [] arr2 = new String[3];
                 arr = arr2;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        System.out.println(arr);

    }
}
