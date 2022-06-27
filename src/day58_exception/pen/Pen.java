package day58_exception.pen;

public class Pen {

    int inkLevel;


    public void write(int checkInk) throws OutOfInkException {

        if((inkLevel - checkInk) <= 10){
            throw new OutOfInkException("Writing with pen, " + (inkLevel - checkInk) + " not enough ink");
        }
        System.out.println("Writing with pen, " + (inkLevel -= checkInk) + " enough ink");
        ;
    }




    public void changeColor(String color){
        if (color.equalsIgnoreCase("red") || color.equalsIgnoreCase("black") || color.equalsIgnoreCase("blue") ){
            System.out.println(color + " color is correct");
        }else {
            throw new InvalidColorException();
        }
    }
}
