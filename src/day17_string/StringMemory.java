package day17_string;

public class StringMemory {
    public static void main(String[] args) {
        String first = "java";
        String second = new String("java");
        String third = "java";
        String fourth = new String("java");

        System.out.println(first == second);// false
        System.out.println(first == third); // true
        System.out.println(first == fourth); // false
        System.out.println(second == fourth); // false
        System.out.println(first.equals(second)); // true
        System.out.println(second.equals(fourth)); // true

        String str = "dog";

        System.out.println(str); // dog

        System.out.println(str.concat(" cat"));

        System.out.println(str);






    }
}
