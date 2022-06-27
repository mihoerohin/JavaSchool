package day43_costom_classes;

public class UseCarpet {
    public static void main(String[] args) {
        Carpet carpet1 = new Carpet(true, 8.5, 12, 4.5);
        System.out.println(carpet1);

        System.out.println();
        carpet1.length = 54;
        carpet1.calculatePrise();
        System.out.println(carpet1);
    }
}
