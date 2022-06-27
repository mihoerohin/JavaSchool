package day00_GroupClass.task_04;

import java.util.Arrays;

public class ConcatTwoArrays {

    public static int[] concatArray(int[] num1, int[] num2){

        int[] result  = Arrays.copyOf(num1, num1.length + num2.length);

        for (int i = 0; i < num2.length; i++) {
            result[i + num1.length] = num2[i];
        }
        System.out.println(Arrays.toString(result));

        return result;
    }

    public static String concat (String[] words, int[] nums) {

        String result = "";

        for (String each : words) {
            System.out.print(each + " ");
        }
        for (int each : nums) {
            System.out.print(each + " ");
        }
        System.out.println();

        return result;
    }

    public static int concat2 (int[] num1, int[] num2) {

        int result = 0;

        for (int each : num1) {
            System.out.print(each + " ");
        }
        for (int each : num2) {
            System.out.print(each + " ");
        }
        System.out.println();

        return result;
    }
    public static void main(String[] args) {

        String[] w = {"java", "selenium", "world"};
        int[] n = {1,2,3,4,5,6,7};
        int[] x = {11,22,33,44,55};

        concat(w,n); // words and integer numbers

        concat2(n,x);  // only integer number

        concatArray(n, x); // only integer number

    }
}
