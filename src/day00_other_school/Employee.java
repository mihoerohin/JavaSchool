package day00_other_school;

public class Employee {
    private String name;
    private double salary;

    public void setName(String name) {

        if ((name.length() > 0) && Character.isUpperCase(name.charAt(0))) {
                this.name=name;
             }
    }
    public String getName(){
        return name;
    }

}
