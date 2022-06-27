package day38_arrayList;

import java.util.ArrayList;

public class ClassRoom {
    public static void main(String[] args) {

        ArrayList<String> group = new ArrayList<>();
        System.out.println(group.size());

        group.add("miho");
        group.add("Eva");
        group.add("LOL");
        group.add("Boss");
        
        System.out.println(group);
        System.out.println(group.size());
        System.out.println(group.get(2));


        for (int i = 0; i < group.size(); i++) {
            System.out.println("Student " + (i + 1) + " " + group.get(i));

        }
    }
}
