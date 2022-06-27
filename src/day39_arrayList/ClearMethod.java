package day39_arrayList;

import java.util.ArrayList;

public class ClearMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();


        nums.add(111);
        nums.add(222);
        nums.add(1, 111111111);
        nums.add(333);
        nums.add(444);
        nums.add(555);
        System.out.println(nums);

        nums.clear();

        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println(nums.isEmpty());


    }
}
