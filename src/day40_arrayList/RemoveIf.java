package day40_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIf {
    public static void main(String[] args) {

        ArrayList<Integer> base = new ArrayList<>(Arrays.asList(3,5,2,6,4,7,345,76,34,4,3,2));

        ArrayList<Integer> nums = new ArrayList<>(base);
        nums.removeIf(n -> n % 2 != 0);
        System.out.println(nums);

        ArrayList<Integer>nums2 = new ArrayList<>(base);
        nums2.removeIf(each -> each < 10);
        System.out.println(nums2);

        ArrayList<String> days = ArrayListWithMethods.getDaysOfWeek();
        days.removeIf(day -> day.startsWith("S") || day.startsWith("T"));
        System.out.println(days);

        ArrayList<String> count = ArrayListWithMethods.getDaysOfWeek();
        count.removeIf(w -> w.length() > 6 );
        System.out.println(count);

    }
}
