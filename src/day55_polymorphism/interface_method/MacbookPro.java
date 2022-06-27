package day55_polymorphism.interface_method;

public class MacbookPro implements Mac{
    @Override
    public void turnOn() {
        System.out.println("Mac is turning on");
    }
}

class Runner{

    public static void main(String[] args) {


        System.out.println(Mac.NAME);
        System.out.println(Mac.OS);
//        System.out.println(MacbookPro.NAME);
//        System.out.println(MacbookPro.OS);

        System.out.println("1~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Mac.company();

        System.out.println("2~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        MacbookPro macbookPro = new MacbookPro();
        macbookPro.turnOn();


        System.out.println("3~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        macbookPro.faceTime();



    }
}
