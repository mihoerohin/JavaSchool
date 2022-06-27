package day55_polymorphism.shopping;

public final class Target extends Shopping{

    @Override
    public void buy() {
        System.out.println("Buying from target");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning Item to Target");
    }
}
