package day41_arrayList;

import java.util.function.Predicate;

public class UsePredicate {
    public static Predicate<String> isPalindrome = str -> {
        String revers = new StringBuilder(str).reverse().toString();
        return str.equals(revers);
    };
    public static Predicate<Integer> isPrime = n ->{
        boolean valid = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return  false;
            }
        }
        return true;
    };
}
