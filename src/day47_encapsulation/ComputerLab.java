package day47_encapsulation;

public class ComputerLab {
    public static void main(String[] args) {

        System.out.println("Hello world");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Computer comp = new Computer("HP", 500, "Silver");
        System.out.println("111 " + comp);
        System.out.println(comp.brand);
        comp.color = "pink";
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Computer.hasScreen = false; // can change variable from true ==> false
        System.out.println(Computer.hasScreen);
    }
}
