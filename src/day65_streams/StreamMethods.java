package day65_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        // creating Stream

        int[] arr = {1,2,3,4,5};
        Arrays.stream(arr);

        List<Integer> list = new ArrayList<>(Arrays.asList(4,6,3,7,8));
        list.stream();
        System.out.println(list);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // remove duplicates
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4,4,4,4,4,6,3,7,9,6,3,7,8,4,7,7,99));
        System.out.println("distinct() method " + list2.stream().distinct().collect(Collectors.toList()));
        System.out.println("original list " + list2);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        int[] arr2 = {4,4,4,4,4,6,3,7,9,6,3,7,8,4,7,7,99};
        arr2 = Arrays.stream(arr2).distinct().toArray();
        System.out.println("Array distinct() " + Arrays.toString(arr2));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //skip the defined number of element
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(list3);                                                   //  [1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(list3.stream().skip(4).collect(Collectors.toList()));  //   [5, 6, 7, 8, 9]
        System.out.println(list3.stream().skip(7).collect(Collectors.toList()));  //   [8, 9]

        List<Integer> list31 = new ArrayList<>(Arrays.asList(99,22,4,4,4,2,4,4,6,3,7,9,6,3,7,8,4,7,7,99,100,200,300));
        System.out.println(list31.stream().skip(20).collect(Collectors.toList())); //  [100, 200, 300]
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // limit(); only first elements
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(list4.stream().limit(4).collect(Collectors.toList()));               // [1, 2, 3, 4]
        System.out.println(list4.stream().limit(5).skip(3).collect(Collectors.toList()));   //  [4, 5]
        System.out.println(list4.stream().skip(3).limit(4).collect(Collectors.toList()));   //  [4, 5]
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // count();
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,1,1,2,3,4,5,6,3,4,4));
        System.out.println(list.stream().count());                  // 5
        System.out.println(list5.stream().distinct().count());      // 6

        // Task: find how many letters there is (no about duplicate)
        String str = "aaabbbcccddee";
        System.out.println(Arrays.stream(str.split("")).distinct().collect(Collectors.toList()));   // [a, b, c, d, e]
        System.out.println(Arrays.stream(str.split("")).distinct().count());                        // 5





    }
}
