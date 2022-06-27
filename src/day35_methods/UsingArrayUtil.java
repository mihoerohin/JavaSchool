package day35_methods;

import my_utilities.ArrayUtil;

public class UsingArrayUtil {

    public static void main(String[] args) {
        
        int [] s = {43,12,456,3434,54,34,66,9};

        System.out.println(ArrayUtil.minNumber(s));

        System.out.println(ArrayUtil.maxNumber(s));
    }
}
