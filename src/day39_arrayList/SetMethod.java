package day39_arrayList;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(111);
        nums.add(222);
        nums.add(333);
        nums.add(444);
        nums.add(555);
        System.out.println(nums);

        nums.set(0, -100);
        System.out.println(nums);

        nums.set(3, 99999);
        System.out.println(nums);
    }
}
