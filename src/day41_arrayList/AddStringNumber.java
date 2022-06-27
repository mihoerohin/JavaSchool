package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AddStringNumber {
    public static ArrayList<Integer> sumFromString(ArrayList<String> list) {

        ArrayList<Integer> sum = new ArrayList<>();

        for (String each : list) {
            int currentSum = getCurrentSum(each);
            sum.add(currentSum);
        }
        return sum;
    }

    public static int getCurrentSum(String each) {
        int currentSum = 0;

        for (String eachDigit : each.split("")) {

            currentSum += Integer.parseInt(eachDigit);
        }
        return currentSum;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "524234", "43"));
        System.out.println(list);

        System.out.println(sumFromString(list));
    }


}