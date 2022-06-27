package day00_GroupClass.task_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingInDescendingOrder {

//    3️⃣ ArrayList - sorting in descending order
//    Write a method that can sort the ArrayList in descending order without using the sort method

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4,8,34,56,1,45,123,2,7,0,-34,-22,3,4,343));

        System.out.println(SortNumRevers(numbers));
    }

    public static ArrayList<Integer> SortNumRevers(ArrayList<Integer> nums){


        for (int i = 0; i < nums.size(); i++) {

            for (int j = 0; j < nums.size(); j++) {

                if(nums.get(i) > nums.get(j)){
                    Collections.swap(nums, i, j);
                }
            }
        }
        return nums;
    }
}
