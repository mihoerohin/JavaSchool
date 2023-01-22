package day39_arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RemoveByObject {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(1300);
        nums.add(1050);
        System.out.println(nums + " V1");

        nums.remove(0);
        System.out.println(nums + " V2");

        Integer i = 1300;
        nums.remove(i);
        System.out.println(nums + " V3");


        nums.remove(Integer.valueOf(200));
        System.out.println(nums + " V4");

        nums.remove((Integer) 800);
        System.out.println(nums + " V5");

        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(100);
        num2.add(200);
        num2.add(1300);
        num2.add(1050);
        System.out.println(num2 + " V01");


        num2.remove((Integer) 1300);
        System.out.println(num2 + " V02");

        num2.remove(Integer.valueOf(1050));
        System.out.println(num2);

    }



}
