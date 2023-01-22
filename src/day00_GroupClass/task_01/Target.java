package day00_GroupClass.task_01;

import java.util.HashMap;
import java.util.Map;

public class Target {

    public static void main(String[] args) {

        int[] arr = {8, 7, 2, 5, 3, 1, 0, 4, 5, 6, 3};

        System.out.println(targetNum(arr, 6));
        System.out.println(targetNum(arr, 5));
        System.out.println(targetNum(arr, 4));
    }

    public static Map<Integer, Integer> targetNum(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                int sum = arr[i] + arr[j];

                if (sum == target) {

                    map.put(i, j);
                }

            }


        }
        return map;
    }
}
