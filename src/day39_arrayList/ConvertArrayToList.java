package day39_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr) + " v1");

        Arrays.asList(arr);    // convert the array a collection type (ArrayList)

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));

        System.out.println(nums + " v2");


        ArrayList<Integer> other = new ArrayList<>(Arrays.asList(4,5,6,7));
        System.out.println(other + " v3 new with .asList");

        System.out.println(nums.size());


    }
}
