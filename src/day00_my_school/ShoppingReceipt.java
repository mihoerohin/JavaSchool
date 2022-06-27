package day00_my_school;

public class ShoppingReceipt {
    public static void main(String[] args) {

        double cake = 24.25;
        double water = 3.99;
        double appleJuice = 7.25;
        double bread = 4.25;
        double tax = 0.08875;

        double totalAmount = cake + water + appleJuice + bread;
        double taxCheck = totalAmount * tax;
        double grandTotal = totalAmount + taxCheck;

        System.out.println("\n\n");

        System.out.println("******************************");
        System.out.println("     WELCOME TO THE STORE");
        System.out.println("******************************");

        System.out.println("\n______________________________");

        System.out.println("Cake\t\t\t\t\t" + cake);
        System.out.println("Water\t\t\t\t\t" + water);
        System.out.println("Apple Juice\t\t\t\t" + appleJuice);
        System.out.println("Bread\t\t\t\t\t" + bread);
        System.out.println("\n______________________________");

        System.out.println("TOTAL AMOUNT:\t\t\t$" + totalAmount);
        System.out.println("TAX:\t\t\t\t\t$" + taxCheck);
        System.out.println("GRAND TOTAL:\t\t\t$" + grandTotal);

        System.out.println("\n______________________________");

        System.out.println("**********THANK YOU***********");
        System.out.println("______________________________");


        //todo
    }


}
