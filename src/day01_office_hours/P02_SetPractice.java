package day01_office_hours;

import java.sql.Array;
import java.util.*;

public class P02_SetPractice {
    public static void main(String[] args) {

        String[] browsers = {"Chrome", "Opera", "Safari", "Explorer", "Edge", "Remote_Chrome"};


        System.out.println("----------HASHSET----------");
        Set<String> hashSet = new HashSet<>(Arrays.asList(browsers));
        System.out.println(hashSet);
        hashSet.add(null);
        System.out.println(hashSet);

        System.out.println("----------LINKEDHASHSET----------");
        Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(browsers));
        System.out.println(linkedHashSet);
        linkedHashSet.add(null);
        System.out.println(linkedHashSet);


        System.out.println("----------TREESET----------");
        Set<String> treeSet = new TreeSet<>(Arrays.asList(browsers));
        System.out.println(treeSet);
//        treeSet.add(null);          NullPointerException
        System.out.println(treeSet);


        System.out.println("----------TASK----------");
        Integer[] a = {1,2,4,4,7,456,7,345,5,3,57};

        ArrayList<Integer> list = new ArrayList(Arrays.asList(a));

        System.out.println(list);// [1, 2, 4, 4, 7, 456, 7, 345, 5, 3, 57]

        System.out.println(new LinkedHashSet<>(list)); // remove same numbers  [1, 2, 4, 7, 456, 345, 5, 3, 57]

        System.out.println(new ArrayList<>(new LinkedHashSet<>(list)).get(3)); // 7

        System.out.println(new TreeSet<>(list));  // [1, 2, 3, 4, 5, 7, 57, 345, 456]

    }
}
