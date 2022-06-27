package day14_if_statements;

import java.util.Scanner;

public class RealEstate {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("********************");
        System.out.println("What is your budget?");
        double budget = input.nextDouble();

        String name = "", range = "";
        double  rating = 0;
        boolean gated = false, allowPets = false, isAvailable = true;

        if (budget > 0 && budget < 300_000) {
            System.out.println("lets see if there is no houses...\n--------------------------------");

            if(budget >= 50_000 && budget <= 75_000){
                name = "Oaks";
                range = "50,000 - 75,000";
                rating = 3.5;
                gated = false;
                allowPets = true;
            }else if(budget >= 80_000 && budget <= 100_000){
                name = "Hills";
                range = "80,000 - 100,000";
                rating = 4.0;
                gated = false;
                allowPets = false;
            }else if(budget >= 120_000 && budget <= 140_000){
                name = "Brooklyn";
                range = "120_000 - 140,000";
                rating = 1.5;
                gated = true;
                allowPets = true;

            }else if(budget >= 150_000 && budget <= 180_000){
                name = "Briton";
                range = "150,000 - 180,000";
                rating = 3.3;
                gated = false;
                allowPets = true;
            }else if(budget >= 190_000 && budget <= 210_000){
                name = "Manhattan";
                range = "190,000 - 210,000";
                rating = 5.0;
                gated = true;
                allowPets = true;
            }else{
                System.out.println("No houses in the price!!!\n****************");
            }

            String ad = "Name of the neighborhood: " + name + "\nPrice: $" + range + "\nRating: " + rating;
            ad += "\nGated: " + (gated ? "Yes" : "No");
            ad += "\nAllow pets: " + (allowPets ? "Yes" : "No");

            System.out.println(ad);

        } else {
            if (budget <= 0) {
                System.out.println("Your budget cannot be less then 0");
            } else {
                System.out.println("Too much for this agency");
            }


        }


    }

}