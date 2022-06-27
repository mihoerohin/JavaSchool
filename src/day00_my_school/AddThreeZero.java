package day00_my_school;

import java.util.Arrays;
import java.util.Scanner;

public class AddThreeZero {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);

        int[] nums = new int[3];



        for (int i = 0; i < 3; i++) {
            nums[i] = scan.nextInt();
        }
        int[] nums2 = Arrays.copyOf(nums, 6);
        System.out.println(Arrays.toString(nums2));

    }

    }
