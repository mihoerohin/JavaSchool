package day48_encapsulation;

import my_utilities.StringUtil;

import java.util.Arrays;

public class Normal {
    public static void main(String[] args) {
        int [] a = { 3, 5, 34, 4444, 23, 333, 12};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Math.PI);
        System.out.println(StringUtil.reverse("you are Spoiled"));
        
    }
}
