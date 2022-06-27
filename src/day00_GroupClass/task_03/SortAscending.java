package day00_GroupClass.task_03;

import java.util.ArrayList;
import java.util.Collections;

public class SortAscending {
    public static void main(String[] args) {

         int[] num = {8,7,6,5,4,3,2,1,234,24,999,123};
        ArrayList<Integer> num2 = new ArrayList<>();

        for (int i = 0; i < num.length ; i++) {
            num2.add(num[i]);
        }
        Collections.sort(num2);
        System.out.println(num2);
    }
}
