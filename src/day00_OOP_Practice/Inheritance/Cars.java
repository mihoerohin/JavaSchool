package day00_OOP_Practice.Inheritance;

public class Cars extends Vehicles{

    public Cars(String type, String brand, int maxSpeed, int wheels, double weight, double price, int year, String typeVehicles, int countVehicles, String sedan) {
        super(type, brand, maxSpeed, wheels, weight, price, year, typeVehicles, countVehicles, sedan);
    }

    public Cars(int maxSpeed, double weight, double price, int year, String typeVehicles, int countVehicles, String sedan) {
        super(maxSpeed, weight, price, year, typeVehicles, countVehicles, sedan);
    }

    public Cars(String brand, int wheels, double price, int year, String typeVehicles, int countVehicles, String sedan) {
        super(brand, wheels, price, year, typeVehicles, countVehicles, sedan);
    }

    public Cars(String type, String brand, int maxSpeed, int wheels, String typeVehicles, int countVehicles, String sedan) {
        super(type, brand, maxSpeed, wheels, typeVehicles, countVehicles, sedan);
    }

    public Cars(String type, String brand, int maxSpeed, int wheels, double weight, String typeVehicles, int countVehicles, String sedan) {
        super(type, brand, maxSpeed, wheels, weight, typeVehicles, countVehicles, sedan);
    }

    public void sedan(){
        System.out.println(type + " - " + "volvo " + "WV " + "BMW ");
    }

    public void compact(){
        System.out.println(type + " - " + "nissan " + "toyota " + " honda");
    }

}
