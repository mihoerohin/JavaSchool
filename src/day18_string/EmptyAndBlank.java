package day18_string;

public class EmptyAndBlank {
    public static void main(String[] args) {

        String str = "Last example";
        System.out.println(str.isEmpty());  // false

        str = "";
        System.out.println(str.isEmpty());  // true

        String s = " ";
        String s2 = "      ";

        System.out.println("s is empty: " + s.isEmpty()); // false   1 character
        System.out.println("s2 is empty: " + s2.isEmpty()); // false 6 characters

        System.out.println("s is blank: " + s.isBlank());    // true       1 white space = 0
        System.out.println("s2 is blank: " + s2.isBlank());    // true     6 white spaces = 0




    }
}
