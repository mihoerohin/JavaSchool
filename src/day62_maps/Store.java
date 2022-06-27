package day62_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

        Map <String, Double> store = new HashMap<>();

        store.put("Water", 1.50);
        store.put("Coffee", 12.75);
        store.put("Apples", 5.00);
        store.put("Bread", 4.50);
        store.put("Cucumber", 2.25);
        store.put("Milk", 3.50);

        System.out.println("Store inventory");

        for(String key : store.keySet()){
            System.out.println("Item: " + key + " for $" + store.get(key) );
        }

//        for(Map.Entry<String, Double> each : store.keySet()){
//            System.out.println("\tItem: " + each.getKey() + " for $" + each.getValue() );
//        }

        Scanner input = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("What item do you want");
        String item = input.nextLine();

        System.out.println(store.containsKey(item) ? item + " is in stock $" + store.get(item) : "Not available in this store");

    }
}
