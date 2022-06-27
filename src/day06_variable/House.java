package day06_variable;

public class House {
    public static void main(String[] args) {

        String houseType = "Penthouse";
        int bedRooms = 5;
        int bathRooms = 2;
        int kitchen = 1;
        boolean basement = true;
        boolean attic = true;
        boolean pool = false;
        boolean sale = true;
        double cost = 1_500_000.99;
        String address = "2045 east 29 street";
        int zipCode = 11225;
        boolean parkNearBy = false;
        double ratingSchool = 3.3;

        System.out.println("\n\b\b\bSale house: " + sale + "\n");
        System.out.println("Address " + address + ", zip code " + zipCode);
        System.out.println("Type house: " + houseType + ", Number of bedrooms " + bedRooms + ", Bathrooms " + bathRooms + ", Kitchen " + kitchen + ", Basement " + basement + ", Attic " + attic + ", Pool " + pool);
        System.out.println("Rating of surrounding school districts: " + ratingSchool + ", a park near by " + parkNearBy);
        System.out.println("\nCost: $" + cost);



    }
}
