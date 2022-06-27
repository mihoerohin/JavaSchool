package day37_methods_arraylist;

public class ValueVSParse {
    public static void main(String[] args) {

        String s = "30";

        int seconds = Integer.parseInt(s);

        Integer i = Integer.valueOf(s);

        int i2 = Integer.valueOf(s);

        String s2 = String.valueOf(30);
        System.out.println(s2 + 5 );
    }
}
