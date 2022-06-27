package day40_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();

        System.out.println(shoppingList.isEmpty() ? "Shopping list Empty" : "You have some items");
        String  keepAsking;

        do {
            System.out.println("Enter the item");
            shoppingList.add(input.nextLine());

            System.out.println("Do you want continue y/n");
            keepAsking = input.nextLine();

        }while(keepAsking.equals("yes") || keepAsking.equals("y"));

        System.out.println("Shopping list:");
        for (String item : shoppingList) {
            System.out.println("*\t " + item);
        }
        System.out.println("-----------------------------------------");
        System.out.println(shoppingList.contains("water") ? "Water on List" : "No water on the List");

        System.out.println("Do you want to remove any items?");
        if(input.nextLine().equals("yes") || input.nextLine().equals("y")){
            System.out.println("What item do you want to remove");
            String removeItem =input.nextLine();

            if (Character.isDigit(removeItem.charAt(0))) {

                int nums = Integer.parseInt(removeItem);
                shoppingList.remove(nums - 1);
            }else{
                shoppingList.remove(removeItem);
            }
        }
        System.out.println("Final list: " +shoppingList);
    }
}
