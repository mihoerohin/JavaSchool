package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BadPairs {

    public static ArrayList<Integer> removeBedPairs(ArrayList<Integer> list){

        ArrayList<Integer> goodPairs = new ArrayList<>();
        
        for (int i = 0; i < list.size(); i+=2) {
            
            if (list.get(i) < list.get(i + 1)){
                goodPairs.add(list.get(i));
                goodPairs.add(list.get(i + 1));
            }

        }
        return goodPairs;
    }

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 1, 10, 8, 44, 44, 3, 10));
        System.out.println(removeBedPairs(nums));

    }

}
