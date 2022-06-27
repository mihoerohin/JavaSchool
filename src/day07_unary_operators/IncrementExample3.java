package day07_unary_operators;

public class IncrementExample3 {
    public static void main(String[] args) {

        int m = 5;
        int z = m++;

        System.out.println(m);
        System.out.println(z);

        int a = 10;
        int b = a + 1;

        System.out.println(a);
        System.out.println(b);

        int c = ++a; // a - 10 -> 10 + 1 = 11

        System.out.println(c);
        System.out.println(a);


    }
}
