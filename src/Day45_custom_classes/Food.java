package Day45_custom_classes;

public class Food {
     String name;
     int quantity;
     double unitPrice;
     double getUnitPrice;

    public Food(String name){
        this.name = name;
    }
    public Food(String name, int quantity){
        this(name);
        this.quantity = quantity;
    }
    public Food(String name, int quantity, double unitPrice) {
        this(name, quantity);
        this.unitPrice = unitPrice;
        CalculatePrise();
    }
    public void CalculatePrise(){
        getUnitPrice = quantity * unitPrice;
    }
    public String toString(){
        return "Item " + name + " ~ " + quantity + " x " + unitPrice + " for $" + getUnitPrice;
    }

}
