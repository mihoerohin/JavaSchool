package day21_string;

public class Factorial {
    public static void main(String[] args) {

        int n = 5;
        int result = 1;

        // 5 * 4 * 3 * 2 * 1
        //repeated action: multiply the numbers by one less than if
        //stopping point: number get to 1

        while(n != 0){
            System.out.println(result + " * " + n);
            result *= n;
            n--;
        }
        System.out.println(result);

    }
}
