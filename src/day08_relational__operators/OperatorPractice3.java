package day08_relational__operators;

public class OperatorPractice3 {
    public static void main(String[] args) {

        int h = 5;
        int p = h;

        h++;
        System.out.println("h " + h); // h + 1
        System.out.println("p " + p); // before + 1
        System.out.println(++p);
        System.out.println(++p);
        System.out.println(++h);

        int k = h++;
        System.out.println("h " + h);
        System.out.println("k " + k);
        System.out.println("\n\n\n");






    }
}
