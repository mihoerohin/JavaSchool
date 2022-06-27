package day50_inheritance.computer;

public class Lab {
    public static void main(String[] args) {

        Computer obj1 =  new Computer("Generic OS", 666);
        System.out.println(obj1);

        Windows obj2 = new Windows(256);
        System.out.println(obj2);

        Mac obj3 = new Mac("Mac", 1028);
        System.out.println(obj3);
    }
}
