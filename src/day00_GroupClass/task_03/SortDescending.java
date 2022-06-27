package day00_GroupClass.task_03;

import java.util.Arrays;

public class SortDescending {

//    Array - Sort Descending
//    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
//    Ex:  int[] arr = {10,20,7, 8, 90};
//    arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};

    public static void main(String[] args) {

        int[] num = {8,7,6,5,4,3,2,1,234,24,999,123};
        int[] result = new int[num.length];
        int index = num.length-1;

        for (int i = 1; i < Integer.MAX_VALUE; i++) {

            for (int j = 0; j < num.length; j++) {
                if(i == num[j]){
                   result[index] = i;
                   index--;
                }
            }

        }
        System.out.println(Arrays.toString(result));

    }
}
