package day63_functional_interface;

public class UsingDynamicInterface {
    public static void main(String[] args) {

        DynamicInterface<String> printEachChar = (str) -> {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        };
        printEachChar.test("Mama I'm coming home");

        DynamicInterface<Integer> printNumber5times = n -> {
            System.out.println(n);
            System.out.println(n);
            System.out.println(n);
            System.out.println(n);
            System.out.println(n);
        };
        printNumber5times.test(24);
    }
}
