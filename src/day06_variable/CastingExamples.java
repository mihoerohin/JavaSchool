package day06_variable;

public class CastingExamples {
    public static void main(String[] args) {

        byte num1 = 40;
        short nun2 = 41;

        System.out.println(num1);
        System.out.println(nun2);

        float num3 = 100.5F;
        short num4 = (short) num3;

        System.out.println("\n" + num3);
        System.out.println(num4);

        float num5 = 1024;
        byte num6 = (byte) num5;

        System.out.println("\n" + num5);
        System.out.println(num6);

        char letter1 = 'A';
        int letter = letter1;

        System.out.println("\n" + letter);
        System.out.println(letter1);

        System.out.println("\n" + (char)76);
        System.out.println((int)letter);
        System.out.println((int)'$');


    }
}
