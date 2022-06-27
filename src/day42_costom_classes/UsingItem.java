package day42_costom_classes;

public class UsingItem {
    public static void main(String[] args) {
        System.out.println();

        Item item1 = new Item();
        item1.name = "apple";
        item1.price = 3.99;

        System.out.println(item1);

        Item item2 = new Item();
        item2.name = "pear";
        item2.price = 4.99;

        System.out.println(item2);
    }
}
