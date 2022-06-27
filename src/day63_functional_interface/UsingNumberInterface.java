package day63_functional_interface;

public class UsingNumberInterface {
    public static void main(String[] args) {

        NumberInterface evenOrOdd = (n) -> {
            if(n % 2 == 0){
                System.out.println(n + " is even");
            }else {
                System.out.println(n + " is odd");
            }
        };

        evenOrOdd.apply(24);
        evenOrOdd.apply(23);


        NumberInterface cube = (number) -> {
            System.out.println("Cube size " + number + " => " + number*number*number);
        };
        cube.apply(3);
        cube.apply(5);
    }
}
