package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicateNumbers {
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> numbers){
        numbers.removeIf(num -> Collections.frequency(numbers, num)>1);
        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,3,5,7,8,7,7,9,3,12,15,5,7,8,99));
        System.out.println(nums);

        System.out.println(Collections.frequency(nums, 7));

        System.out.println(removeDuplicates(nums));
    }
}
