package day10_scanner;

import java.util.Scanner;

public class Apartment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String address, nameOfOwner, ownersPhoneNumbers;
        int numberOfUnits, numberOfWasherAndDryer, lengthOfLease, totalNumberOfResidents, numberOfFloors, numberOfParkingSpots, numberOfStars;
        double avgSizeOfUnit, monthlyRent;
        boolean allowsPets, hasPool, nearGasStation, hasBasement, unitsAvailable, hasAirConditioning, wheelChairAccessibility;

        System.out.println("Pleas enter your address");
        address = input.nextLine();

        System.out.println("Pleas enter the name of the owner");
        nameOfOwner = input.nextLine();

        System.out.println("Pleas enter " + nameOfOwner + "'s phone number");
        ownersPhoneNumbers = input.nextLine();

        System.out.println("Pleas enter the number of unit");
        numberOfUnits = input.nextInt();

        System.out.println("Pleas enter the number of W/D");
        numberOfWasherAndDryer = input.nextInt();

        System.out.println("Pleas enter the number of floors");
        numberOfFloors = input.nextInt();

        System.out.println("Pleas enter the number of residents");
        totalNumberOfResidents = input.nextInt();

        System.out.println("Pleas enter the number of parking slots");
        numberOfParkingSpots = input.nextInt();

        System.out.println("Pleas enter average size of unit");
        avgSizeOfUnit = input.nextInt();

        System.out.println("Number of stars");
        numberOfStars = input.nextInt();

        System.out.println("Monthly rent");
        monthlyRent = input.nextInt();

        double rateAfter3Years = monthlyRent * 0.9;
        double rateAfter6Years = monthlyRent * 0.8;
        int avgNumOfResidentPerUnit = totalNumberOfResidents / numberOfUnits;
        int avgNumOfParkingSlots = numberOfParkingSpots / numberOfUnits;
        int avgNumOfUnitsPerFloors = numberOfUnits / numberOfFloors;

        System.out.println("does the apt allow pets?");
        allowsPets = input.nextBoolean();

        System.out.println("has pool?");
        hasPool = input.nextBoolean();

        System.out.println("has near gas station");
        nearGasStation = input.nextBoolean();

        System.out.println("is units available");
        unitsAvailable = input.nextBoolean();

        System.out.println("has AC");
        hasAirConditioning = input.nextBoolean();

        System.out.println("Wheelchair accessibility");
        wheelChairAccessibility = input.nextBoolean();

        System.out.println("Rate after 3 years " + rateAfter3Years);
        System.out.println("Rate after 6 years " + rateAfter6Years);
        System.out.println("Avg numbers of parking slots " + avgNumOfParkingSlots);
        System.out.println("Avg numbers of resident per unit " + avgNumOfResidentPerUnit);
        System.out.println("Avg numbers of units per floors " + avgNumOfUnitsPerFloors);

    }
}
