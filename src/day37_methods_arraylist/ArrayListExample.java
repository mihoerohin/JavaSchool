package day37_methods_arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);

        numbers.add(100);
        numbers.add(333);
        System.out.println(numbers);
        numbers.add(-12);
        numbers.add(22);
        numbers.add(123456789);
        System.out.println(numbers);

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(3));
        System.out.println(numbers.get(1 + 1));
        System.out.println(numbers.get(1 + 3));

        System.out.println();
        System.out.println("How many elements: " + numbers.size());

    }
}
