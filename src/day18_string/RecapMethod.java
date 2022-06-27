package day18_string;

public class RecapMethod {
    public static void main(String[] args) {

        String s = "pen";

        String s2 = new String("pen");

        System.out.println("\nCompare with == " + (s == s2));
        System.out.println("Compare with .equals " + (s.equals(s2)));

        System.out.println("\ncompare with .equals() " + s.equals("Pen"));
        System.out.println("compare with .equalsIsIgnoreCase() " + s.equalsIgnoreCase("pen"));
    }
}
