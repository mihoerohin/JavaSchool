package day00_other_school;

import java.util.Arrays;

public class Map_one {

        public static int[] map(int[] arr) {


            for(int i = 0; i < arr.length; i++){
                arr[i] *= 2;

            }
            return arr;
        }

    public static void main(String[] args) {
            int [] arr = {1,2,3,4};

        for(int i = 0; i < arr.length; i++){
            arr[i] *= 2;

        }
        System.out.println(Arrays.toString(arr));


    }
}
