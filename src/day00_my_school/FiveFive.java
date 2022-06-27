package day00_my_school;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FiveFive {
    public static void main(String[] args) {

        int a = 3;
        int b =7;

        System.out.println(a + " " + b);
        System.out.println((a+b-a) + " " + (b+a-b));


        
         int[] nums = {2,3,4,5,5,6,4};
         boolean n = false;


        for(int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 5 && nums[i + 1] == 5) {

             n = true;
                


            }
        }
        System.out.println(n);

   
    }
}
