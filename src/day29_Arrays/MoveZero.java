package day29_Arrays;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {



        int[] nums2 = {0, 10, 0, 5, 0, 1, 0, 3, 7, 0, 4};

        for (int e = 0; e < nums2.length; e++) {

            if (nums2[e] == 0) {

                for (int i = e + 1; i < nums2.length; i++) {

                    if (nums2[i] != 0) {
                        nums2[e] = nums2[i];
                        nums2[i] = 0;
                        break;
                    }


                }
            }
        }
        System.out.println("# " + Arrays.toString(nums2));

        int[] nums = {10, 0, 5, 0, 1, 0};
        int[] fixed = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                fixed[index++] = nums[i];
            }
        }

        System.out.println(Arrays.toString(fixed));

    }
}
