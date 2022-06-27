package day43_costom_classes;

public class Phone {

    String name;
    String brand;
    double memory;
    double version;

    public Phone(String name){
        this.name = name;
    }
    public Phone(String name, String brand){
        this.name = name;
        this.brand = brand;
    }
    public Phone(String name, String brand, double memory, double version){
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.version = version;
    }

    public String toString() {

        String obj = name;
        if (brand != null){
            obj += " | " + brand;
        }
        if (memory != 0.0){
            obj += " | " + memory;
        }
        if (version != 0.0){
            obj += " | " + version;
        }
        return obj;
    }
}
