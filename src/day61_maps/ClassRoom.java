package day61_maps;

import java.util.HashMap;
import java.util.Map;

public class ClassRoom {

    public static void main(String[] args) {

        Map<Integer, Student> map = new HashMap<>();

        map.put(1, new Student("Misha", 9.0, 7));

        Student obj = new Student("Janna",19.9, 13);
        map.put(2, obj);

        map.put(3, new Student("Nastya", 12.2, 11));

        map.put(4, new Student("Jehad", 2.2, 4));

        System.out.println(map);

        System.out.println(map.get(2));        //  Student{name='Janna', gpa=99.9, id=13}

        System.out.println(map.get(3).name);   //  Nastya

        System.out.println(map.get(4).gpa);    //   2.2

        System.out.println(map.keySet());      //  [1, 2, 3, 4]

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (int keys : map.keySet()) {
            System.out.println("Rank " + keys);
            System.out.println(map.get(keys));
        }


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (Student student : map.values()){
            if(student.id <= 10){
                System.out.println("Student ==> " + student.name);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (Student student : map.values()){
            if (student.gpa >= 10){
                System.out.println("student " + student.name + ", Id number " + student.id);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                    //another way to loop
        for (Map.Entry<Integer, Student> entry : map.entrySet()){
            System.out.println("Rank " + entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }





    }
}
