package day53_abstraction.cars;

public class Tesla extends ElectricCar{

    @Override
    public void charger() {
        System.out.println("Charging tesla");
        System.out.println("Press button");

    }

    @Override
    public void start() {
        System.out.println("Card in the car");

    }
}
