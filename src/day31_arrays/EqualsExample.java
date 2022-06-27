package day31_arrays;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {

        int [] a = {1, 2, 3};
        int [] b = {1, 2, 3};
        int [] c = a;

        System.out.println(a == b);     // false
        System.out.println(Arrays.equals(a,b));   // true
        System.out.println(a == c);               // true
        System.out.println(a.equals(b));         // false    not arrays method

        boolean same = Arrays.equals(a,b);
        System.out.println(same);           // true

        int [] d = {3, 2, 1};
        System.out.println(Arrays.equals(a,d));    // false

    }
}
