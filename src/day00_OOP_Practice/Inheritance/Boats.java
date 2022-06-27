package day00_OOP_Practice.Inheritance;

public class Boats extends Transport{

    public String typeBoats;
    public int countBoats;

    public Boats(String type, String brand, int maxSpeed, int wheels, double weight, double price, int year, String typeBoats, int countBoats) {
        super(type, brand, maxSpeed, wheels, weight, price, year);
        this.typeBoats = typeBoats;
        this.countBoats = countBoats;
    }

    public Boats(int maxSpeed, double weight, double price, int year, String typeBoats, int countBoats) {
        super(maxSpeed, weight, price, year);
        this.typeBoats = typeBoats;
        this.countBoats = countBoats;
    }

    public Boats(String brand, int wheels, double price, int year, String typeBoats, int countBoats) {
        super(brand, wheels, price, year);
        this.typeBoats = typeBoats;
        this.countBoats = countBoats;
    }

    public Boats(String type, String brand, int maxSpeed, int wheels, String typeBoats, int countBoats) {
        super(type, brand, maxSpeed, wheels);
        this.typeBoats = typeBoats;
        this.countBoats = countBoats;
    }

    public Boats(String type, String brand, int maxSpeed, int wheels, double weight, String typeBoats, int countBoats) {
        super(type, brand, maxSpeed, wheels, weight);
        this.typeBoats = typeBoats;
        this.countBoats = countBoats;
    }
}



