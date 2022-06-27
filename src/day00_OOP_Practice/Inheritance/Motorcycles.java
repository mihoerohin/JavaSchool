package day00_OOP_Practice.Inheritance;

public class Motorcycles extends Vehicles {

    public Motorcycles(String type, String brand, int maxSpeed, int wheels, double weight, double price, int year, String typeVehicles, int countVehicles, String sedan) {
        super(type, brand, maxSpeed, wheels, weight, price, year, typeVehicles, countVehicles, sedan);
    }

    public Motorcycles(int maxSpeed, double weight, double price, int year, String typeVehicles, int countVehicles, String sedan) {
        super(maxSpeed, weight, price, year, typeVehicles, countVehicles, sedan);
    }

    public Motorcycles(String brand, int wheels, double price, int year, String typeVehicles, int countVehicles, String sedan) {
        super(brand, wheels, price, year, typeVehicles, countVehicles, sedan);
    }

    public Motorcycles(String type, String brand, int maxSpeed, int wheels, String typeVehicles, int countVehicles, String sedan) {
        super(type, brand, maxSpeed, wheels, typeVehicles, countVehicles, sedan);
    }

    public Motorcycles(String type, String brand, int maxSpeed, int wheels, double weight, String typeVehicles, int countVehicles, String sedan) {
        super(type, brand, maxSpeed, wheels, weight, typeVehicles, countVehicles, sedan);
    }

    public void bike(){
        System.out.println("SUZUKI");
    }
}
