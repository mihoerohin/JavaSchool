package day08_relational__operators;

public class GiftCard {
    public static void main(String[] args) {

        String gift = "GiftCard $";

        double x = 200;
        System.out.println(gift + x);
        x -= 100;
        System.out.println("buy item 1 for " + x);
        x -= 15;
        x -= 25;
        System.out.println("buy item 2 for " + x);
        x = -x + 100;
        System.out.println("Balance " + x);



    }
}
