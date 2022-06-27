package day00_OOP_Practice.Inheritance;

public class Airplanes extends Transport{

    public String Airplanes;
    public int countAirplanes;

    public Airplanes(String type, String brand, int maxSpeed, int wheels, double weight, double price, int year, String airplanes, int countAirplanes) {
        super(type, brand, maxSpeed, wheels, weight, price, year);
        Airplanes = airplanes;
        this.countAirplanes = countAirplanes;
    }

    public Airplanes(int maxSpeed, double weight, double price, int year, String airplanes, int countAirplanes) {
        super(maxSpeed, weight, price, year);
        Airplanes = airplanes;
        this.countAirplanes = countAirplanes;
    }

    public Airplanes(String brand, int wheels, double price, int year, String airplanes, int countAirplanes) {
        super(brand, wheels, price, year);
        Airplanes = airplanes;
        this.countAirplanes = countAirplanes;
    }

    public Airplanes(String type, String brand, int maxSpeed, int wheels, String airplanes, int countAirplanes) {
        super(type, brand, maxSpeed, wheels);
        Airplanes = airplanes;
        this.countAirplanes = countAirplanes;
    }

    public Airplanes(String type, String brand, int maxSpeed, int wheels, double weight, String airplanes, int countAirplanes) {
        super(type, brand, maxSpeed, wheels, weight);
        Airplanes = airplanes;
        this.countAirplanes = countAirplanes;
    }
}
