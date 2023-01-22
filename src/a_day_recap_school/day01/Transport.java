package a_day_recap_school.day01;

public class Transport {

    int numOfPass;
    int fuelCapacity;

    Company company;

    public Transport(int numOfPass, int fuelCapacity) {
        this.numOfPass = numOfPass;
        this.fuelCapacity = fuelCapacity;
    }
}

    class Car extends  Transport{
        public Car(int numOfPass, int fuelCapacity) {
            super(numOfPass, fuelCapacity);
        }
    }


    class AirPlane extends Transport {
        public AirPlane(int numOfPass, int fuelCapacity) {
            super(numOfPass, fuelCapacity);
        }
    }


    class Company {

        String name;
        int employees;
        public Company(String name) {
            this.name = name;
        }

        public Company(String name, int employees) {
            this(name);
            this.employees = employees;
        }
    }


    class Runner{
        public static void main(String[] args) {

            Car car = new Car(33, 4);
            car.company = new Company("Lilu");
            System.out.println(car.company.name);

        }

    }
    class Test1{
    int one;
    int two;
    int three;
    int four;
    }
