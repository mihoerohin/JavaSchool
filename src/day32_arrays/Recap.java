package day32_arrays;

import java.util.Arrays;

public class Recap {

    public static void main(String[] args) {


        int[] arr = {30, 60, 90, 360, 120};
        int[] arr2 = {120, 360, 90, 60, 30};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("Before sorting: " + Arrays.equals(arr, arr2));  // false

         Arrays.sort(arr);
         Arrays.sort(arr2);

        System.out.println("\n" + Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("After sorting: " + Arrays.equals(arr, arr2));


        String[] words = {"Java", "Hello", "Sunday"};
        System.out.println();

        System.out.println( String.join(" ### ", words));

        String str = "today is saturday";

        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(Arrays.toString(str.split(" ")));


    }


}
