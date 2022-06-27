package day56_polymorphism.cars;

public class Car {}


    class BMW extends Car{}

    class Tesla extends Car{}

    class Toyota extends Car{}

    class Honda extends Car{}

    class Ford extends Car{}

    class LandRover extends Car{}

    class Dealership {

        public static void lease(Car car){
            System.out.println("leasing a car" + car.getClass().getName());

        }

        public static Car getCar(int option){
            if(option == 1) {
                return new Tesla();
            }else if (option == 2){
                return new Toyota();
            } else if (option == 3) {
                return new Honda();
            } else if (option == 4) {
                return new BMW();
            } else if (option == 5) {
                return new Ford();
            } else if (option == 6) {
                return new LandRover();
            }else {
                return new Car();
            }
        }
}

class Runner {
    public static void main(String[] args) {

        Car car = new Car();
        Dealership.lease(car);

        Tesla tesla = new Tesla();
        Dealership.lease(tesla);

        Dealership.lease(new LandRover());

        Dealership.lease(new Honda());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Car car1 = Dealership.getCar(3);  // Honda
        Dealership.lease(car1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Tesla tesla1 = (Tesla)Dealership.getCar(1); // Tesla
        Dealership.lease(tesla1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Car car2 = Dealership.getCar(4); // BMW
        Dealership.lease(car2);

    }
}
