package day00_GroupClass.task_02;

import java.util.Arrays;

public class FindMaximum {
    public static void main(String[] args) {
//    Array - Find Maximum
//  Write a method that can find the maximum number from an int Array

        int[] nums = {3,5,787,123,2,-99,5,-83};
        Arrays.sort(nums);
        System.out.println(nums[nums.length-1]);

    }
}
