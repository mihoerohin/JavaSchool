package day08_relational__operators;

public class GallonsToLitters {
    public static void main(String[] args) {

        /* create a class called GallonsToLiters, and write a program that can convert the gallons to litters
            Ex:
                gallon = 10;
                output:
                    10 gallons equal to 37.8541 liters
                gallon = 20
                 output:
                    20 gallons equal to 75.7082 liters   */
        double litter = 3.78541;
        double gallon = 1;




        System.out.println("1 gallon = " + gallon * litter);
        System.out.println("2 gallons = " + ++gallon * litter);
        System.out.println("3 gallons = " + ++gallon * litter);


    }
}
