package day09_scanner;

public class LogicPractice {
    public static void main(String[] args) {

        int x = 5;
        System.out.println(x > 2);
        System.out.println(x < 10);

        System.out.println(x > 2 && x < 10);
        System.out.println(x > 2 || x < 10);
        System.out.println(x > 2 || false);
        System.out.println(x < 2 || false);

        System.out.println("\n" + !false); // not false => true
        System.out.println(!true);  // not true => false
        System.out.println(4 != 4);

    }
}
