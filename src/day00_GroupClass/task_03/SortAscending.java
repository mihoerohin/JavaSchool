package day00_GroupClass.task_03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortAscending {
    public static void main(String[] args) {

         int[] num = {8,7,6,5,4,3,2,1,234,24,999,123};

        ArrayList<Integer> list = new ArrayList<>();
        for(Integer integer : num){
            list.add(integer);
        }


        for(int i = 0; i < list.size(); i++){
            for (int j = 0; j < list.size(); j++){
                if(list.get(i) < list.get(j) ){
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }

            }
        }
        System.out.println(list);


        System.out.println("sortMethod(num) = " + sortMethod(num));

    }
    public static ArrayList<Integer> sortMethod(int[] num) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            list.add(num[i]);
           }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {

            if(list.get(i) < list.get(j)) {
               int temp = list.get(i);
               list.set(i, list.get(j));
               list.set(j, temp);
             }
         }
      }

        return list;
    }
}
