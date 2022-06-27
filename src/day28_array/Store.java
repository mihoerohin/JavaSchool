package day28_array;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {


          String [] items = {"shoes", "Jackets", "Gloves", "Airpods", "IPad"};

         boolean hasJacket = false;

        for (int i = 0; i < items.length; i++){

                if(items[i].equalsIgnoreCase("jackets")) {
                    hasJacket = true;
                    break;
                }
        }
        System.out.println(hasJacket ? "Jacket in stock" : "Jacket out stock");
    }
}
