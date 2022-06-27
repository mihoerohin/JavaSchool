package day36_methods;

public class ArrayIndexOf {

    public static void main(String[] args) {
        int[] arr = {12, 4, 6, 34, 676, 2, 9};
                   // 0  1  2   3   4   5  6
        System.out.println(indexOf(arr,2)); //show me number index  =5
        System.out.println(indexOf(arr,22));


    }
    public static int indexOf(int[] nums, int element) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
               return i;
            }
        }
        return -1;
    }

}
