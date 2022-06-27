package day56_polymorphism.book;

public class Library {
    public static void main(String[] args) {
        System.out.println("1~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        JavaTextbook book1 = new JavaTextbook();
        book1.name = "Java Programming";
        book1.size = 20.5;
        book1.fun = true;
        book1.read();
        book1.open();
        book1.download();

        System.out.println(book1.name);
        System.out.println(book1.size);
        System.out.println(book1.fun);
        System.out.println("2~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        EBook book2 = new JavaTextbook();
        System.out.println(book2.name = "Java Programming");
        book2.size = 20.5;
//        book2.fun = true; EBook reference does not hate access to the fun variable
        ((JavaTextbook)book2).fun = true;  // cast the preference from the parent EBook to the child reference of JavaTextBook and that allows us to access the fun
        book2.read();
        book2.open();
        book2.download();
        System.out.println("3~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Book book3 = new JavaTextbook();
        book3.name = "Java Programming";
//        book3.size = 20.5;
//        book3.fun = true;
        book3.read();
//        book3.open();
//        book3.download();
        System.out.println("4~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Downloadable book4 = new JavaTextbook();
//        book4.name = "Java Programming";
//        book4.size = 20.5;
//        book4.fun = true;
//        book4.read();
//        book4.open();
        book4.download();
        System.out.println("5~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        JavaTextbook book5 = (JavaTextbook)book4;
        book5.read();
        book5.open();
        System.out.println(book5.fun = false);
        System.out.println(book5.size = 2.5);
        System.out.println(book5.name = "DNA");


    }
}
