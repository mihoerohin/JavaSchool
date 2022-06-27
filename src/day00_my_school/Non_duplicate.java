package day00_my_school;

import java.util.Arrays;
import java.util.Scanner;

public class Non_duplicate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

      Arrays.sort(nums);

     int [] num = Arrays.copyOf(nums , nums.length+1);

        int result = 0;

        for (int i = 0; i < num.length - 1; i += 2) {
            if(num[i] != num[i + 1]){
                result = num[i];
                break;
            }


        }
        System.out.println(result);

    }
}
