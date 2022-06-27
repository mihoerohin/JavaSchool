package day32_arrays;

import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {

        int [] n = {5, 10, 20, 10};
        int [] m = {5, 10, 100, 39, 19};

        int [][] all = {n, m};
        System.out.println(all);
        System.out.println(Arrays.toString(all));
        System.out.println("\nDeep array: " + Arrays.deepToString(all));
        System.out.println("First array: " + Arrays.toString(all[0]));
        System.out.println("Second array: " + Arrays.toString(all[1]));
        System.out.println();

        int[][] multi = {

                {90, 60, 90},               // index 0 array
                {12, 13, 14, 15},           // index 1 array
                {10, 9, 8, 7, 6, 5},        // index 2 array
                {99}                        // index 3 array
        };

        System.out.println(multi.length);    // count lines , result 4
        System.out.println(multi[0].length); // count index, result 3
        System.out.println(multi[0][1]);     // index = 0, number = 1, result 60
        System.out.println(multi[3].length);   //index 3, count numbers, result 1
        System.out.println(multi[2][4]);      // index = 2, number = 4, result 6

    }


}
