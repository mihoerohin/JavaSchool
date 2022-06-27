package day49_inheritance.Person;

public class Building {
    public static void main(String[] args) {

        Person obj = new Person();
        obj.name = "Mike";
        obj.age = 33;
        obj.favoriteHobby = "Skiing";
        obj.talk();
        System.out.println("obj.age = " + obj.age);
        System.out.println("obj.favoriteHobby = " + obj.favoriteHobby);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Student obj2 = new Student();
        obj2.name = "Kobe";
        obj2.age = 24;
        obj2.favoriteHobby = "Basketball";
        obj2.talk();
        obj2.funLevel = 100;
        obj2.study();
    }
}
