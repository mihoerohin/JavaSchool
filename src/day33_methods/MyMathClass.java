package day33_methods;

public class MyMathClass {
    public static void add(double numOne, double numTwo){
        System.out.println(numOne + " + " + numTwo + " = " + (numOne + numTwo));
    }
    public static void subtract(double numOne, double numTwo){
        System.out.println(numOne + " - " + numTwo + " = " + (numOne - numTwo));
    }
    public static void multiply(double numOne, double numTwo){
        System.out.println(numOne + " * " + numTwo + " = " + (numOne * numTwo));
    }
    public static void division(double numOne, double numTwo){
        System.out.println(numOne + " / " + numTwo + " = " + (numOne / numTwo));
    }

    public static void main(String[] args) {
        System.out.println("\nadd");
        add(3.4, 7.7);
        add(4,5);
        add(123.123, 876.877);

        System.out.println("\nsubtract");

        subtract(123.333, 12.323);
        subtract(100, 50);

        System.out.println("\nmultiply");

        multiply(78, 45);
        multiply(1.3223, 9.99);

        System.out.println("\ndivision");

        division(111, 10);
        division(53.4, 2);
    }
}
