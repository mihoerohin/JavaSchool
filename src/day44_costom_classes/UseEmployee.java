package day44_costom_classes;

public class UseEmployee {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Miho", 221287,"SDET", 120000);
        System.out.println(employee1);
        System.out.println();

        Employee employee2 = new Employee("Janna", "Secret agent");
        System.out.println(employee2);
        System.out.println();

        employee1.goToMeeting();
        employee2.goToMeeting();
    }
}
