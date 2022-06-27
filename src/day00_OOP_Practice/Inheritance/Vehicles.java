package day00_OOP_Practice.Inheritance;

public class Vehicles extends Transport{

    public String typeVehicles;
    public int countVehicles;
    public String sedan;

    public Vehicles(String type, String brand, int maxSpeed, int wheels, double weight, double price, int year, String typeVehicles, int countVehicles, String sedan) {
        super(type, brand, maxSpeed, wheels, weight, price, year);
        this.typeVehicles = typeVehicles;
        this.countVehicles = countVehicles;
        this.sedan = sedan;
    }

    public Vehicles(int maxSpeed, double weight, double price, int year, String typeVehicles, int countVehicles, String sedan) {
        super(maxSpeed, weight, price, year);
        this.typeVehicles = typeVehicles;
        this.countVehicles = countVehicles;
        this.sedan = sedan;
    }

    public Vehicles(String brand, int wheels, double price, int year, String typeVehicles, int countVehicles, String sedan) {
        super(brand, wheels, price, year);
        this.typeVehicles = typeVehicles;
        this.countVehicles = countVehicles;
        this.sedan = sedan;
    }

    public Vehicles(String type, String brand, int maxSpeed, int wheels, String typeVehicles, int countVehicles, String sedan) {
        super(type, brand, maxSpeed, wheels);
        this.typeVehicles = typeVehicles;
        this.countVehicles = countVehicles;
        this.sedan = sedan;
    }

    public Vehicles(String type, String brand, int maxSpeed, int wheels, double weight, String typeVehicles, int countVehicles, String sedan) {
        super(type, brand, maxSpeed, wheels, weight);
        this.typeVehicles = typeVehicles;
        this.countVehicles = countVehicles;
        this.sedan = sedan;
    }
}
