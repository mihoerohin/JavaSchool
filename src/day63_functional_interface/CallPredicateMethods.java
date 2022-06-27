package day63_functional_interface;

import day41_arrayList.UsePredicate;

public class CallPredicateMethods {
    public static void main(String[] args) {

        boolean b = UsePredicate.isPalindrome.test("racecar"); // true
        System.out.println(b);

        System.out.println(UsePredicate.isPalindrome.test("qwerty")); // false

        System.out.println(UsePredicate.isPrime.test(5)); // true
        System.out.println(UsePredicate.isPrime.test(20));  // false

    }
}
