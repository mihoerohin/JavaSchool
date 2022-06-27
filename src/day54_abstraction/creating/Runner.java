package day54_abstraction.creating;

public class Runner {
    public static void main(String[] args) {

        Book obj = new Book(); // Book is a normal(non-abstract) class
        obj.read();
        obj.write();
    }
}
