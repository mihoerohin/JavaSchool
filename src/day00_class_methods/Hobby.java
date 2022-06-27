package day00_class_methods;

public class Hobby {

    String name;
    double annualCost;
    boolean isOutdoors;
    boolean requiresOther;

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutdoors=" + isOutdoors +
                ", requiresOther=" + requiresOther +
                '}';
    }

    public Hobby(String name, double annualCost, boolean isOutdoors, boolean requiresOther){
        this.name = name;
        this.annualCost = annualCost;
        this.isOutdoors = isOutdoors;
        this.requiresOther = requiresOther;


    }


    public static void main(String[] args) {
        Hobby obj = new Hobby("Basketball", 234, true, true);
        System.out.println(obj);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Hobby obj2 = new Hobby("Video games", 100, false, true);
        System.out.println(obj2);
    }
}

