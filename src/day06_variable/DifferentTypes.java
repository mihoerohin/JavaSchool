package day06_variable;

public class DifferentTypes {
    public static void main(String[] args) {

        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 5);
        //             double   /  int  =  double
        System.out.println(10.0 / 5);
        //             double   /  double  = double
        System.out.println(10.0 / 5.0);
        //             double   /  double  = double
        System.out.println(10 / 5.0);

        System.out.println((int)10.0 / 5);
        System.out.println((int)(10.0 / 5.0));
        System.out.println((int)10.5 / 5);

        System.out.println((double)10 / 5);


        byte b1 = 10;
        byte b2 = 20;

        byte sum = (byte)(b1 + b2);
        int sum2 = b1 + b2;
        System.out.println(sum);
        System.out.println(sum2);






    }
}
