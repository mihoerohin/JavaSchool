package day65_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Recap {
    public static void main(String[] args) {

//        Use BiPredicate functional interface to:
//        1.1 Create a function that can check if two array are equal and contains the same elemnts
//        ex: arr1 = {3,2,1}
//        arr2 = {2,1,3}
//
//        output: true

        BiPredicate<int[], int[]> arrayIsEqual = (arr1, arr2) -> {

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1,arr2);

        };

        int[] arr1 = {1,2,3};
        int[] arr2 = {3,2,1};

        System.out.println(arrayIsEqual.test(arr1, arr2)); // true

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//
//        1.2 Create a function that can check if the first array contains all the elemnts of the second array:
//        ex: arr1 = {1,2,3,4,5,6}
//        arr2 = {7,8}
//
//        output: false

        BiPredicate<int[], int[]> firstContains = (array1, array2) -> {

            for (int outer : array2){
                boolean check = false;

                for (int inner : array1){
                    if(outer == inner){
                        check = true;
                        break;
                    }
                }
                if (!check){
                    return false;
                }
            }
            return true;
        };

        int[] array1 = {1,2,3,4,5};
        int[] array2 = {3,4,5,6,7};

        System.out.println(firstContains.test(array1, array2)); // false

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // 1,3,5,7
        // 2,4,6,8

        BiFunction<int[], int[], List<Integer>> mergeToList = (arr3, arr4) -> {

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr3.length; i++) {
                list.add(arr3[i]);
                list.add(arr4[i]);
            }
            return list;
        };

        int[] nums1 = {1,3,5,7};
        int[] nums2 = {2,4,6,8};

        System.out.println(mergeToList.apply(nums1, nums2)); //[1, 2, 3, 4, 5, 6, 7, 8]


    }
}
