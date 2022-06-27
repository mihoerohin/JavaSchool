package day29_Arrays;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {

        int [] nums = {10, 0, 5, 0, 1, 0};
        int [] fixed  = new int[nums.length];
        int index = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] != 0){
                fixed[index++] = nums[i];
            }
        }

        System.out.println(Arrays.toString(fixed));

    }
}
