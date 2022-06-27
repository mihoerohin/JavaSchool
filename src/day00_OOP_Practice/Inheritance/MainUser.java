package day00_OOP_Practice.Inheritance;

public class MainUser {
    public static void main(String[] args) {

        Transport transport = new Transport ("Sport", "BMW", 320, 4, 2500.00, 75500.00, 2022);

        System.out.println(transport);
        System.out.println("transport.brand = " + transport.brand);
    }
}
