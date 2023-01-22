package day00_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NumInWord {

    public static void main(String[] args) {


        String str = "4of Fo1r peo6ple g3ood the5 th2e";

       runNumFromWord(str);
    }

    public static void runNumFromWord(String str){


        ArrayList<String> list22 = new ArrayList<>(Arrays.asList(str.split(" ")));
        ArrayList<String> stringArrayList = new ArrayList<>();

        for (int i = 0; i < list22.size(); i++) {
            for (String each : list22){
                String temp = Integer.toString(i);
                if (each.contains(temp)){
                    stringArrayList.add(each);
                }
            }
        }

        System.out.println(stringArrayList);

    }

}
