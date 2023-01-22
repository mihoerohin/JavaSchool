package day00_map_my_school;

import java.util.HashMap;
import java.util.Map;

public class MapPractice02 {
    public static void main(String[] args) {

        HashMap<Integer, Person> scrumTeam1 = new HashMap<>();

        Person person = new Person("Mike", "PO", 34, 200000);
        scrumTeam1.put(0, person);

        scrumTeam1.put(1, new Person("James","Tester",24,130000));
        scrumTeam1.put(2, new Person("Dilshod","PO",26,180000));
        scrumTeam1.put(3, new Person("Olga","BA",23,125000));
        scrumTeam1.put(4, new Person("Ahmet","SM",28,150000));
        scrumTeam1.put(5, new Person("Hasan","Tester",23,145000));

        System.out.println(scrumTeam1);

        ////////////////////////////REPLACE//////////////////////
        scrumTeam1.replace(1, new Person("Janna",scrumTeam1.get(1).getJobTitle(), 31, scrumTeam1.get(1).getSalary()));
        System.out.println(scrumTeam1.get(1));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        ////////////////////////////REMOVE//////////////////////
        scrumTeam1.remove(3);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        ////////////////////////////CONTAINS//////////////////////
        System.out.println(scrumTeam1.containsKey(1));  //true
        System.out.println(scrumTeam1.containsKey(3));  //false

        System.out.println(scrumTeam1.containsValue(person)); //true

        ////////////////////////////////////////////////////////
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (Integer integer : scrumTeam1.keySet()) {
            System.out.println(integer);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (Person value : scrumTeam1.values()) {
            System.out.println(value);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (Person title : scrumTeam1.values()) {
            System.out.println(title.getJobTitle());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (Person name : scrumTeam1.values()) {
            System.out.println(name.getName());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (Map.Entry<Integer, Person> eachEntry : scrumTeam1.entrySet()) {
            System.out.println(eachEntry);

        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (Map.Entry<Integer, Person> personEntry : scrumTeam1.entrySet()) {
            System.out.println(personEntry.getKey() + " " + personEntry.getValue().getName() + " " + personEntry.getValue().getSalary());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (Map.Entry<Integer, Person> eachEntry : scrumTeam1.entrySet()) {
            if (eachEntry.getValue().getJobTitle().equals("Tester")){
                scrumTeam1.replace(eachEntry.getKey(), new Person(eachEntry.getValue().getName(),eachEntry.getValue().getJobTitle(),eachEntry.getValue().getAge(),eachEntry.getValue().getSalary()+9999));
            }

        }
        System.out.println(scrumTeam1);


    }

}
