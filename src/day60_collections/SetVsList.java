package day60_collections;

import java.lang.reflect.Array;
import java.util.*;

public class SetVsList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(-5);
        list.add(10);
        list.add(4);
        System.out.println(list);
        System.out.println("first: " + list.get(0));
        System.out.println("last: " + list.get(list.size() - 1));

        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(10);
        set.add(1);
        set.add(2);
        set.add(-5);
        set.add(10);
        set.add(4);
        System.out.println(set);
//        System.out.println("first: " + set.get(0));
//        System.out.println("last: " + set.get(set.size() - 1));
        // set does not have indexes

        // because set does not have indexes, we can use a loop to go through the elements
        for(int each : set){
            System.out.println(each);
        }

        // sort my HashSet
        System.out.println(new TreeSet<>(set));

        // converting list to set
        System.out.println(new LinkedHashSet<>(list));

        System.out.println(new HashSet<>(Arrays.asList(1,3,5,2,7,4,8,5)));

        String s = "aaaaaaaaaaaaaaabbbbbbbbbbccccccccccddddddeeee";
        System.out.println(new HashSet<>(Arrays.asList(s.split("")))
                .toString()
                .replace(", ","")
                .replace("[ ","")
                .replace("] ",""));




    }
}
