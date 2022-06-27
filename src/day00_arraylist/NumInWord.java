package day00_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NumInWord {

    public static void main(String[] args) {


        String str = "4of Fo1r peo6ple g3ood the5 th2e";

        String[] arr = str.split(" ");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).contains("1")) {
                list1.remove(0);
                list1.add(0,list.get(i));

            } else if (list.get(i).contains("2")) {
                list1.remove(1);
                list1.add(1,list.get(i));

            } else if (list.get(i).contains("3")) {
                list1.remove(2);
                list1.add(2,list.get(i));;

            } else if (list.get(i).contains("4")) {
                list1.remove(3);
                list1.add(3,list.get(i));

            } else if (list.get(i).contains("5")) {
                list1.remove(4);
                list1.add(4,list.get(i));

            } else if (list.get(i).contains("6")) {
                list1.remove(5);
                list1.add(5,list.get(i));
                
            }
        }
        System.out.println(list1);
    }

}
