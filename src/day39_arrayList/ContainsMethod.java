package day39_arrayList;

import java.util.ArrayList;

public class ContainsMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(111);
        nums.add(222);
        nums.add(333);
        nums.add(444);
        nums.add(555);
        System.out.println(nums);


        System.out.println(nums.contains(222));
        System.out.println(nums.contains(22));

    }
}
