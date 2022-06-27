package day00_OOP_Practice.Inheritance;

public class Trucks extends Vehicles{

    public Trucks(String type, String brand, int maxSpeed, int wheels, double weight, double price, int year, String typeVehicles, int countVehicles, String sedan) {
        super(type, brand, maxSpeed, wheels, weight, price, year, typeVehicles, countVehicles, sedan);
    }

    public Trucks(int maxSpeed, double weight, double price, int year, String typeVehicles, int countVehicles, String sedan) {
        super(maxSpeed, weight, price, year, typeVehicles, countVehicles, sedan);
    }

    public Trucks(String brand, int wheels, double price, int year, String typeVehicles, int countVehicles, String sedan) {
        super(brand, wheels, price, year, typeVehicles, countVehicles, sedan);
    }

    public Trucks(String type, String brand, int maxSpeed, int wheels, String typeVehicles, int countVehicles, String sedan) {
        super(type, brand, maxSpeed, wheels, typeVehicles, countVehicles, sedan);
    }

    public Trucks(String type, String brand, int maxSpeed, int wheels, double weight, String typeVehicles, int countVehicles, String sedan) {
        super(type, brand, maxSpeed, wheels, weight, typeVehicles, countVehicles, sedan);
    }

    public void longTrucks(){
        System.out.println(weight + " - " + "VOLVO " + " SCANIA");
    }

}
