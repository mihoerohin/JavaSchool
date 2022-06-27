package day47_encapsulation;

public class Road {
    public static void main(String[] args) {

        TrafficLight light = new TrafficLight("black");

        TrafficLight light2 = new TrafficLight("Red");
        System.out.println(light2.getColor());

        light2.setColor("grey");
        System.out.println(light2.getColor());

        TrafficLight light3 = new TrafficLight("blue");
        System.out.println(light3.getColor());

    }
}
