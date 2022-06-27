package day43_costom_classes;

public class UseMarker {
    public static void main(String[] args) {

        Marker marker1 = new Marker("Dry Erase", "Expo", "Red");

        System.out.println(marker1);

        marker1.brand = "Sony";
        marker1.type = "Smartphone";
        marker1.color = "Black";

        System.out.println(marker1);
    }
}
