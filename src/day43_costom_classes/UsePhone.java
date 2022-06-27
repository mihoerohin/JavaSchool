package day43_costom_classes;

public class UsePhone {
    public static void main(String[] args) {

     Phone phone1 = new Phone("IPhone X"); // call the constructor line 10
        System.out.println(phone1);

     Phone phone2 = new Phone("IPhone 10", "Apple"); // call line 13
        System.out.println(phone2);

     Phone phone3 = new Phone("Pixel 6", "Google", 256, 11.1); // call line 17
        System.out.println(phone3);

    }
}
