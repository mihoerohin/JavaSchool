package day58_exception.pen;

public class Runner {
    public static void main(String[] args) {

        Pen pen = new Pen();

        pen.inkLevel = 20;
        System.out.println("Level ink in a pen: " + pen.inkLevel);

        try {
            pen.write(13);
        } catch (OutOfInkException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        pen.changeColor("Red");
    }
}