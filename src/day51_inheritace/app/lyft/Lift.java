package day51_inheritace.app.lyft;

public class Lift {

    String driver;

    public Lift(String driver){
        this.driver = driver;
    }
    public double calculate (int mile){
        return  mile * 1.50;
    }
}
