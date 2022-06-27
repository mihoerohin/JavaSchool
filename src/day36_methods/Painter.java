package day36_methods;

public class Painter {
    public static void main(String[] args) {

        Picture.draw();
        Picture.draw(100);
        Picture.draw("blue");
        Picture.draw("black", "white");

        String s = "200";
        Picture.draw(s);

        Picture.draw(222, "red");
        Picture.draw("green", 787);
    }
}
