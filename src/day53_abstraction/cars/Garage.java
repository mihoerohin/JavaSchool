package day53_abstraction.cars;

public class  Garage {
    public static void main(String[] args) {

        Toyota obj = new Toyota();
        obj.start();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Honda obj2 = new Honda();
        obj2.start();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Tesla obj3 = new Tesla();
        obj3.start();
        obj3.charger();
    }
}
