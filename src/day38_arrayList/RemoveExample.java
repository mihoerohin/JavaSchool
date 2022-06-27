package day38_arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList<String > list = new ArrayList<>();
        list.add("water");
        list.add("sun");
        list.add("lol");
        list.add("omg");
        System.out.println(list);

        list.remove(0);    
        System.out.println(list);

        System.out.println(list.remove(list.size() - 1));
        System.out.println(list);

        System.out.println(list.remove("lol"));
        System.out.println(list);

        list.add("lol");
        list.add("omg");
        list.add("lol");
        list.add("god");
        list.add("lol");

        System.out.println(list);
        list.remove("lol");
        System.out.println(list);


         int [] j = {1,2,3};

        for (int i = 0; i < 3; i++) {
            j[i] = (j[i] * 2);

        }
        System.out.println(Arrays.toString(j));
    }
}
