package day55_polymorphism.clothes;

public class Store {
    public static void main(String[] args) {

        TShirt tShirt = new TShirt();
        tShirt.wear();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        Clothes clothes = new TShirt();
        clothes.wear();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
    //    HasHood hasHood = new HasHood(); // T-shirt class does not implement HasHood interface

        Jacket jacket = new Jacket();
        jacket.wear();
        jacket.putOnHood();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");


        Clothes clothes1 = new Jacket();
        clothes1.wear();
    //    clothes1.putOnHood();    does not access to a putOnHood
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");


        var jacket2 = new Jacket();
//        super class Object
//        jacket2.wear();
//        jacket2.putOnHood();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

    }
}
