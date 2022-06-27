package day28_array;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {

        double[] arr = new double[4];

        System.out.println(arr.length);

        System.out.println(Arrays.toString(arr));

        arr[0] = 30.99;
        arr[3] = 88888;

        System.out.println(Arrays.toString(arr));

        arr[2] = 3.99;
        arr[3] = 99.99;

        System.out.println(Arrays.toString(arr));

        arr[1] = 111.111;      // reassigning
        arr[0] = 0.77;

        System.out.println(Arrays.toString(arr));

        arr = new double[6];
        System.out.println(Arrays.toString(arr));

    }
}
