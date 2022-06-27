package day42_costom_classes;

public class Coffee {

    String brand;
    double price;
    int size;
    String type;

    @Override
    public String toString() {
        return "Coffee " +
                "brand: '" + brand + '\'' +
                ", price: $" + price +
                ", size: " + size +
                " oz, type: '" + type + '\'';
    }

}
