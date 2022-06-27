package day38_arrayList;

import java.util.ArrayList;

public class ClassRoomTwo {
    public static void main(String[] args) {

        ArrayList<String> group = new ArrayList<>();
        group.add("Ziba");
        System.out.println(group);

        group.add(0,"Victor");
        System.out.println(group);

        group.add(0, "miho");
        System.out.println(group);

        group.add(3,"lol");
        System.out.println(group);

        group.add(4,"god");
        System.out.println(group);

        group.add(2,"Misha");
        System.out.println(group);

        System.out.println(group.add("cat"));
    }
}
