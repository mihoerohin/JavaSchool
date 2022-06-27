package day43_costom_classes;

public class UseCar {
    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println(car1);  // Null

        car1.model = "Rogue";
        car1.color = "Black";
        car1.year = 2018;
        car1.fuelLevel = 80;
        System.out.println();

        System.out.println(car1);     // nissan rogue

        car1.model = "Audi";
        car1.color = "White";
        car1.year = 2022;
        car1.fuelLevel = 25;
        System.out.println();

        System.out.println(car1);

        System.out.println();

        car1.drive();  // -5
        car1.drive();  // -5
        System.out.println(car1.fuelLevel);

        System.out.println();
        car1.fillTank();
        System.out.println(car1.fuelLevel);
    }
}
