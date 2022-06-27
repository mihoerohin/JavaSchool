package day07_unary_operators;

public class Shopping {
    public static void main(String[] args) {

        int numOfItems = 0;
        double price = 0.0;

        System.out.println("We pick up water");
        System.out.println("How many items ih the cart: " + ++numOfItems);
        price = price + 2.5;

        System.out.println("We pick up 3 eggs");
        System.out.println("How many items in the cart: " + ++numOfItems);
        System.out.println("How many items in the cart: " + ++numOfItems);

        System.out.println(numOfItems++);
    }
}
