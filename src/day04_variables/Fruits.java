package day04_variables;

public class Fruits {
    public static void main(String[] args) {

        int apples = 50;
        int grape = 100;
        int bananas = 150;

        System.out.println("\n");
        System.out.println("This is how many apples we have: " + apples);
        System.out.println("Grape: " + grape);
        System.out.println("Bananas: " + bananas);

        System.out.println("sold some apples");
        apples = 10; // reassinging apples to have value of 25
        System.out.println("Apples after selling; " + apples);

        int price = 15;

        System.out.println("The price of my " + apples + " apples is $" + price);



    }
}
