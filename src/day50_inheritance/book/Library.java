package day50_inheritance.book;

public class Library {
    public static void main(String[] args) {

        Book obj = new Book();

        AudioBook obj2 = new AudioBook();

        obj2.duration = 100;
        obj2.narrator = "Morgan Freeman";
        obj2.title = "Java is fun";
        obj2.listen();

        EBook obj3 = new EBook();
        obj3.size = 20.4;
        obj3.pages = 1023;
        obj3.title = "Soft skills is important";
        obj3.read();

        Book obj4 = new Book();
        obj4.author = new Author("JK Rowling", 40);
        System.out.println(obj4.author);
        System.out.println(obj4.author.getName());
        
    }
}
