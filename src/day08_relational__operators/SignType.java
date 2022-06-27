package day08_relational__operators;

public class SignType {
    public static void main(String[] args) {

        int num = - 0;
        boolean positive = num > 0;
        boolean negative = num < 0;
        boolean zero = num == 0;

        System.out.println(num + " is positive " + positive);
        System.out.println(num + " is negative " + negative);
        System.out.println(num + " is zero " + zero);
    }

}
