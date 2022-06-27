package day32_arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {

        int [] nums = {4, 10 , 30, 100};
        System.out.println(Arrays.binarySearch(nums, 4));
        System.out.println(Arrays.binarySearch(nums, 100));
        System.out.println(Arrays.binarySearch(nums, 200));  //would be in position 4, so 4 + 1, and negative  -5
        System.out.println(Arrays.binarySearch(nums, 6));   //would be in position 1, so 1 + 1, and negative   -2
        System.out.println(Arrays.binarySearch(nums, 1));   //would be in position 0, so 0 + 1, and negative   -1
    }
}
