package day39_arrayList;

import java.util.ArrayList;

public class IndexOfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(333);
        nums.add(1);
        nums.add(222);
        nums.add(333);
        nums.add(1);
        nums.add(444);
        nums.add(1);
        nums.add(555);
        nums.add(444);
        System.out.println(nums);

        System.out.println(nums.indexOf(333));       //   0
        System.out.println(nums.indexOf(123));        // -1

         int i = nums.indexOf(333);
        System.out.println(i);                        // 0
        System.out.println(nums.lastIndexOf(333));  // 3

        System.out.println(nums);
        nums.remove((Integer) 444);
        System.out.println(nums.indexOf(444));
        System.out.println(nums);



        nums.set(nums.indexOf(1),555);
        System.out.println(nums.indexOf(1));
        System.out.println(nums);


    }
}
