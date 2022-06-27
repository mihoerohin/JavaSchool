package day55_polymorphism.interface_method;

public interface Mac {

    String NAME = "Mac"; // public static final variables
    String OS = "IOS";

    void turnOn(); // public abstract


        // way static method
    public static void company(){
        System.out.println("Apple");
        System.out.println("HQ is LA");
        System.out.println("New release in november");
    }

        // way default method
    public default void faceTime(){
        System.out.println("Opening faceTime");
        System.out.println("App");
        System.out.println("Phone calls");
    }
    

}
