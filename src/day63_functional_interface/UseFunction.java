package day63_functional_interface;

import day21_string.Factorial;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class UseFunction {
    public static void main(String[] args) {

        Function<int [], List<Integer>> convertArrayList = (nums) -> {
            List<Integer> list = new ArrayList<>();
            for(int each : nums) {
                list.add(each);
            }
            return list;
        };

        int[] a = {34,5,56,55,3};

        List<Integer> list = new ArrayList<>();
    }
}
