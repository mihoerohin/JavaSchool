package day65_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamMethods2 {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,1,2,3,4,5,6,3,4,4));
        List<Integer> byTwo = list.stream().map(e -> e * 2).collect(Collectors.toList());
        System.out.println(list); //  [1, 1, 1, 2, 3, 4, 5, 6, 3, 4, 4]
        System.out.println(byTwo); // [2, 2, 2, 4, 6, 8, 10, 12, 6, 8, 8]

        List<String> days = new ArrayList<>(Arrays.asList("monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"));
        List<String> abr = days.stream().map(day -> day.substring(0,3)).collect(Collectors.toList());
        System.out.println(days); // [monday, tuesday, wednesday, thursday, friday, saturday, sunday]
        System.out.println(abr); //  [mon, tue, wed, thu, fri, sat, sun]
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        List<Integer> evens = list2.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
        List<Integer> odds = list2.stream().filter(p -> p % 2 != 0).collect(Collectors.toList());
        System.out.println(evens);              //  [2, 4, 6, 8]
        System.out.println(odds);                //  [1, 3, 5, 7, 9]

        System.out.println("evens elements " + list2.stream().filter(p -> p % 2 == 0).count()); //  count each even element
        System.out.println(list2.stream().filter(p -> p % 2 == 0).distinct().count());  //  finding How many unique even numbers

        System.out.println("odds elements " + list2.stream().filter(p -> p % 2 != 0).count()); //  count each odd element
        System.out.println(list2.stream().filter(p -> p % 2 != 0).distinct().count());  // finding how many unique odd numbers
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        List<String> str = new ArrayList<>(Arrays.asList("java", "javascript", "selenium", "cypress", "jAVa", "hello", "JAVA"));
        long java = str.stream().filter(p -> {
            p = p.toLowerCase(Locale.ROOT);
            return p.contains("java");
        }).count();
        System.out.println(java); // 4 - count how many "java" in arrayList
        System.out.println(str.stream().filter(p -> p.toLowerCase().contains("java")).collect(Collectors.toList())); // [java, javascript, jAVa, JAVA]
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list3.stream().filter(element -> element % 2 == 0).forEach(each -> System.out.print(each + " ")); //  2 4 6 8
        System.out.println(); // space
        list3.stream().filter(element -> element % 2 == 0).forEach(System.out::print); // 2468
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        List<Integer> list4 = new ArrayList<>(Arrays.asList(5,10,15,20,25,30));
        System.out.println("divisible by 5 " + list4.stream().allMatch(p -> p % 5 == 0));  //  divisible by 5 true
        System.out.println("even " + list4.stream().allMatch(p -> p % 2 == 0));  // even false

        System.out.println("more than 30 " + list4.stream().anyMatch(p -> p > 30));  // more than 30 false
        System.out.println("more than 20 " + list4.stream().anyMatch(p -> p > 20));  // more than 20 true

        System.out.println("none are above 30 " + list.stream().noneMatch(p -> p > 30));  // none are above 30 true






    }
}
