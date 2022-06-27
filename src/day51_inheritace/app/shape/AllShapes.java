package day51_inheritace.app.shape;

public class AllShapes {
    public static void main(String[] args) {

        Square obj1 = new Square(3.5);
        System.out.println(obj1);

        System.out.println(obj1.area());

        System.out.println(obj1.perimeter());

        Circle obj2 = new Circle(0.5);
        System.out.println(obj2);
    }
}
