package day08_relational__operators;

public class AllOperators {
    public static void main(String[] args) {


        System.out.println(5 + 2 * 3);

        System.out.println(5 * 2 + 4 / 2);

        System.out.println(5 * 2 - 4 / 2);

        System.out.println(5 + 2 > 4 - 2);


        int a = 20; // 20 -> 19 -> 20 -> 19 -> 18
        int b = -a-- + a++ + --a * --a;
            // -20  +  19  +  19 *  19
            // -20  +  19  +  361
            //    - 1      +  361
            //           360

    }
}
