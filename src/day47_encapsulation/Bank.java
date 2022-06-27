package day47_encapsulation;

public class Bank {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(DebitCard.accountType);

        DebitCard obj1 = new DebitCard(1234123412341234L, "miho", 23992884.25);
        System.out.println(obj1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        DebitCard obj2 = new DebitCard(4321432143214321L, "bond", 99922290.99);
        System.out.println(obj2);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(obj2.accountType);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        DebitCard obj3 = new DebitCard(12341234123412L, "Janna", -2399.25);
        System.out.println(obj3);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        DebitCard obj4= new DebitCard(1234123412341277L, "Janna", "LOL", 7, -2399.25);
        System.out.println(obj4);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        DebitCard obj5 = new DebitCard(1234123412341277L, "Greg", "visa", 1234, 332399.25);
        System.out.println(obj5);

    }
}
