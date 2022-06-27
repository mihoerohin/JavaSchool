package day00_GroupClass.task_06;

import java.util.*;

public class SortingInAscending {
//    ArrayList - sorting in ascending
//    Write a method that can sort the ArrayList in Ascending order without using the sort method

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4,8,34,56,1,45,2,7,0,-34,-22,3,4,343));
        System.out.println(SortNums(numbers));
    }

    public static ArrayList<Integer> SortNums(ArrayList<Integer> numbers){

        for (int i = 0; i < numbers.size(); i++) {

            for (int j = 0; j < numbers.size(); j++) {

                if (numbers.get(i) < numbers.get(j)){
                    Collections.swap(numbers, i, j);
                }
            }
        }
        return numbers;
    }
}
