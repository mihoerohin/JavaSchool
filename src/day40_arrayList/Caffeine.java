package day40_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    public static void main(String[] args) {
        ArrayList<String> drink = new ArrayList<>();
        drink.add("coffee");
        drink.add("tea");
        drink.add("monster");
        drink.add("coke");
        System.out.println("1) " + drink);

        ArrayList<String> drinks2 = new ArrayList<>(drink);
        System.out.println("2) " + drinks2);

        String[] allDrinks = {"coffee", "tea", "monster", "coke"} ;
        ArrayList<String> drinks3 = new ArrayList<>(Arrays.asList(allDrinks));
        System.out.println("3) " + drinks3);

        ArrayList<String> drinks4 = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "coke"));
        System.out.println("4) " + drinks4);

        ArrayList<String> drinks5 = new ArrayList<>();
        drinks5.addAll(Arrays.asList("coffee", "tea", "monster", "coke"));
        System.out.println("5) " + drinks5);

        ArrayList<String> animals = new ArrayList<>();
        animals.addAll(Arrays.asList("dog","cat","zebra","lol"));
        System.out.println("6) " + animals);
    }
}
