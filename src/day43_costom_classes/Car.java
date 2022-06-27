package day43_costom_classes;

public class Car {

    String model;
    int year;
    String color;
    int fuelLevel;

    public void drive(){
        System.out.println("Driving " + model);
        fuelLevel -= 5;
    }
    public void fillTank(){
        System.out.println("Filling the tank");
        fuelLevel = 100;
    }

    public boolean isLow(){
        return  fuelLevel < 25;
    }
    

     public String toString(){
         return "Model: " + model +
         "\nYear: " + year +
         "\nColor " + color +
         "\nFuel level " + fuelLevel + "%" +
         "\n" + (isLow() ? "Tank is Low" : "Keep on driving");


         
     }


}
