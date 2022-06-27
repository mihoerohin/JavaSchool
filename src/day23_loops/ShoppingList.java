package day23_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String list = "Shopping list:";
        String addMore;

        do{
            System.out.println("Enter the name of the item");
            list += "\n*" + input.nextLine();

            System.out.println("Do you want add mor to your shopping list?");
            addMore = input.nextLine();

        }while(addMore.equalsIgnoreCase("yes") || addMore.equalsIgnoreCase("y"));

        System.out.println(list);

    }
}
