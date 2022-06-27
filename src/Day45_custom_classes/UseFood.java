package Day45_custom_classes;

import java.util.Arrays;

public class UseFood {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Food pears = new Food("pears", 12, 1.25);
        System.out.println(pears);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Food fish = new Food("fish", 2, 22);
        System.out.println(fish);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Food apples = new Food("Apples", 5, 12);
        System.out.println(apples);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        apples.quantity = 6;
        apples.unitPrice = 3.99;
         apples.CalculatePrise();
        System.out.println(apples);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Total price: $" + apples.getUnitPrice);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        String[] str = {"lol", "two", "one"};

        Food [] allFood = {apples, pears, fish, null};

        System.out.println(allFood[2]);

        allFood[3] = new Food("fish", 3, 3.99);
        System.out.println(Arrays.asList(allFood));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //calculate the total price of the shopping list
        double totalPriceAll = 0;

        for (Food each : allFood){  // each == allFood[i]
            System.out.println(each);
            totalPriceAll += each.getUnitPrice;

        }
        System.out.println("Count each $" + totalPriceAll);


    }
}
