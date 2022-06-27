package day42_costom_classes;

public class UsingCoffee {
    public static void main(String[] args) {
        System.out.println();

        Coffee coffeeShop = new Coffee();
        coffeeShop.brand = "Lavazza";
        coffeeShop.price = 5.99;
        coffeeShop.size = 12;
        coffeeShop.type = "Dark roast";

        System.out.println(coffeeShop);
        System.out.println();

        Coffee refill = new Coffee();
        refill.brand = "Lavazza";
        refill.price = 1.50;
        refill.size = 12;
        refill.type = "Dark roast";
        System.out.println("Refill -->  " + refill);

    }
}
