package day33_methods;

public class Car {
    public static void unlockCar(){
        System.out.println("Unlocking the car");
    }
     public static void openDoor(){
        System.out.println("Opening the door");
    }
    public static void sitInCar(){
        System.out.println("Sitting in the car");
    }
    public static void getReadyToGo(){
        System.out.println("Putting on seatbelt");
        System.out.println("Check memories");
        System.out.println("Put on music");
        System.out.println("Put on navigator");
    }
    public static void startCar(){
        System.out.println("Starting car");
    }
    public static void driveAndGo(){
        System.out.println("Putting cat into drive");
        System.out.println("going forwards");
    }
    public static void goInHurry(){
        unlockCar();
        openDoor();
        sitInCar();
    }



    public static void main(String[] args){
        unlockCar();
        openDoor();
        sitInCar();
        getReadyToGo();
        startCar();
        driveAndGo();

        System.out.println("\n***Go to Hurry***\n");

        goInHurry();
    }
}
