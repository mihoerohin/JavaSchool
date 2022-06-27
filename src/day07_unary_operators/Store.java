package day07_unary_operators;

public class Store {
    public static void main(String[] args) {

        String store = "Target";
        int numOfTvs = 100;

        System.out.println("Bought TV");
        System.out.println("Numbers TV of now " + --numOfTvs);
        System.out.println("Bought TV");
        System.out.println("Numbers TV of now " + --numOfTvs);
        System.out.println("Bought TV");
        System.out.println("Numbers TV of now " + --numOfTvs);
        System.out.println("tv in cart ");
        System.out.println("Numbers TV of now " + numOfTvs--);
        System.out.println("Bought TV after cart, store has ");
        System.out.println("Numbers TV of now " + numOfTvs);

        System.out.println("I get a shipment");
        numOfTvs = numOfTvs + 13;

        System.out.println("Tv in stack " + numOfTvs);





    }
}
