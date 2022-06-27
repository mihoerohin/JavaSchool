package day55_polymorphism.shopping;

public final class Amazon extends OnlineShopping{

    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon cart");
    }

    @Override
    public void payForShipping(boolean b) {
        System.out.println(b ? "Pay for shipping" : "Free Shipping");
    }

    @Override
    public void buy() {
        System.out.println("Buy item from Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning to Amazon drop location");
    }
}