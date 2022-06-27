package day59_collections;

import java.util.*;

public class SetObjects {
    public static void main(String[] args) {

        ArrayList<String> set3 = new ArrayList<>();
        set3.add(null);
        set3.add("hello");
        set3.add("$4.5");
        set3.add("400");
        set3.add("hello");
        set3.add("%");
        set3.add("%");
        set3.add("100%");
        System.out.println(set3);

        Set<String> set = new HashSet<>();
        set.add(null);
        set.add("hello");   // duplicate not allowed
        set.add("$4.5");
        set.add("400");
        set.add("hello");
        set.add("%");       // duplicate not allowed
        set.add("%");
        set.add("100%");
        System.out.println(set);

        Set<String> set2 = new LinkedHashSet<>();
        set2.add(null);
        set2.add("hello");
        set2.add("$4.5");
        set2.add("400");
        set2.add("hello");  //  // duplicate not allowed
        set2.add("%");
        set2.add("%");   // duplicate not allowed
        set2.add("100%");
        System.out.println(set2);


        Set<String> set4 = new TreeSet<>();
       // set4.add(null);    null not allowed in tree
        set4.add("hello");
        set4.add("$4.5");
        set4.add("400");
        set4.add("hello");      // nothing is changed, duplicate not allowed
        set4.add("%");
        set4.add("%");         // nothing is changed, duplicate not allowed
        set4.add("100%");
        System.out.println(set4);
    }
}
