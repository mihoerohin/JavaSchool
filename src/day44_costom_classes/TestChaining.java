package day44_costom_classes;

public class TestChaining {
    public static void main(String[] args) {

        new ChainExample(10);
        System.out.println();

        new ChainExample("Hello");
        System.out.println();

        new ChainExample(123.2);
        System.out.println();
    }
}
