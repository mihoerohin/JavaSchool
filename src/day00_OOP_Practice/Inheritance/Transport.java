package day00_OOP_Practice.Inheritance;

public class Transport {
    String type;
    String brand;
    int maxSpeed;
    int wheels;
    double weight;
    double price;
    int year;


    @Override
    public String toString() {
        return "Transport{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", wheels=" + wheels +
                ", weight=" + weight +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    public Transport(String type, String brand, int maxSpeed, int wheels, double weight, double price, int year) {
        this.type = type;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.wheels = wheels;
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public Transport(int maxSpeed, double weight, double price, int year) {
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public Transport(String brand, int wheels, double price, int year) {
        this.brand = brand;
        this.wheels = wheels;
        this.price = price;
        this.year = year;
    }
    public Transport(String type, String brand, int maxSpeed, int wheels) {
        this.type = type;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.wheels = wheels;

    }
    public Transport(String type, String brand, int maxSpeed, int wheels, double weight) {
        this.type = type;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.wheels = wheels;
        this.weight = weight;


    }

}
