package day55_polymorphism.shopping;

import day48_encapsulation.hiding.A;

public class Runner {
    public static void main(String[] args) {

        Target target = new Target();
        target.price = 10;
        target.buy();
        target.returnItem();

       Amazon amazon = new Amazon();
       amazon.price = 1000;
       amazon.buy();
       amazon.returnItem();
       amazon.payForShipping(true);
       amazon.viewCart();
       System.out.println(amazon.country);

        System.out.println(Shipping.country);

    }
}
