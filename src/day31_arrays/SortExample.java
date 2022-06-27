package day31_arrays;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {

        int [] num = {3, 8, 10, -2, 44, 100, 9999, -1234};

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));



        System.out.println("Min: " + num[0]);
        System.out.println("Max: " + num[num.length-1]);


    }
}
