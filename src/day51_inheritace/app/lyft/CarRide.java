package day51_inheritace.app.lyft;

public class CarRide {

    public static void main(String[] args) {

        Lift obj1 = new Lift("Kobe");
        System.out.println(obj1.calculate(10));

        LyftXL obj2 = new LyftXL("Mike");
        System.out.println(obj2.calculate(10));


    }
}
