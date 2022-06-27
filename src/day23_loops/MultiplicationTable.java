package day23_loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        int n = 2;
        for(int i = 0; i <= 10; i++ ) {
            System.out.println(n + " / " + i + " = " + (i / n));
            i++;
        }
    }
}
