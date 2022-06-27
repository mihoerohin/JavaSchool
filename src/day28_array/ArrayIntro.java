package day28_array;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        //normal variable

        String city1 = "Chicago";
        String city2 = "New York";
        String city3 = "Houston";
        String city4 = "Denver";
        String city5 = "Pittsburgh";

        //declare array with values

        String[] cities = {"Chicago", "New York", "Houston", "Denver", "Pittsburgh"} ;

        System.out.println(cities[0] + " and " + cities[4] + " and " + cities[2]);

        System.out.println(Arrays.toString(cities));

        System.out.println(cities.length);





    }
}
