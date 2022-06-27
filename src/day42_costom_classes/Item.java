package day42_costom_classes;

public class Item {

    String name;
    double price;

    //      generate --> toString --> OK
    @Override
    public String toString() {
        return "Item --> " +
                "name - " + name + ", " +
                "price: $" + price;
    }
}
