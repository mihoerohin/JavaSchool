package day00_other_school;

import java.util.Scanner;

public class kila {
    public static void main(String[] args) {

        int card = 100;
        int priceMilk = 20;
        int priceBread = 50;

        Scanner input = new Scanner(System.in);
        String one = input.nextLine();
        System.out.println("print 1 - milk or 2 - bread");

        switch (one){
            case "1":
                card -= priceMilk;
                System.out.println("Your balance = " + card);
                break;
            case "2":
                card -= priceBread;
                System.out.println("Your balance = " + card);
                break;

        }

    }
}
