package day48_encapsulation.hiding;

public class Person {
    String name = "Kobe Bryant";
}
class SecretIdentity extends Person{
    String name = "DON EBON";
}
class Runner{
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);

        SecretIdentity  secretIdentity = new SecretIdentity();
        System.out.println(secretIdentity.name);
    }
}
