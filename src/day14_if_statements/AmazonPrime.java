package day14_if_statements;

import java.util.Scanner;

public class AmazonPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter price");

        boolean hasPrime = false;
        double shippingFee = 3.99;
        double price = input.nextDouble();



        if(hasPrime){
            System.out.println("Prime, eligible for 2 days shipping");


        }else{
            if(price >= 25){
                System.out.println("Eligible for regular free shipping");
            }else{
                System.out.println("Not eligible for free shipping. Shipping fee: $3.99");
                price += shippingFee;
                System.out.println("total price is: $" + price);
            }
        }


    }
}
