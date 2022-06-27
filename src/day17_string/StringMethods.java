package day17_string;

public class StringMethods {
    public static void main(String[] args) {

        String name = "james";

        System.out.println(name.equals("james"));
        System.out.println("cat".equals("dog"));
        System.out.println("hello world".equals("hello world"));
        System.out.println("______________________");


        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a.equals(b));
        System.out.println(a.equals("hello"));
        System.out.println(a.equals("hello"));
        System.out.println(name.length());
        


    }
}
