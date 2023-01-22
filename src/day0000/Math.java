package day0000;

import java.util.Map;

public class Math {

    public static void main(String[] args) {
        reverse2(1234);

        String str = "public static void main";

        System.out.println("countChar(str, 'a') = " + countChar(str, 'a'));

    }

    // reverse 1234
    public static void reverse2(int num) {

        int reversed = 0;

        System.out.println("Original Number: " + num);

        // run loop until num becomes 0
        while(num != 0) {

            // get last digit from num
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }

    //

    public static int countChar(String str, char x){

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (x == str.charAt(i)){
                count++;
            }

        }
        return count;
    }

}
