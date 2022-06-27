package day00_my_school;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //WRITE YOUR CODE BELOW:
        int count = 0;

        for(int i = 0; i < nums.length; i++){

              if(0 == nums[i] % 2){
                  count++;



              }
        }

        System.out.println(count);

    }
}
