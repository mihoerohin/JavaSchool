package day00_GroupClass.task_03;

import java.util.Arrays;

public class MoveZerosToTheEnd {
//
//    Array - Move Zeros to the End
//    Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
//    Ex:
//    input:  {1,0,2,0,3,0,4,0};
//    output: [1, 2, 3, 4, 0, 0, 0, 0]


    public static void main(String[] args) {

        int[] nums = {0,1,0,2,0,3,0,4,0};

        int[] result = new int[nums.length-1];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                result[index] = nums[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
