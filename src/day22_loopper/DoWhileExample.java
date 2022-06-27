package day22_loopper;

public class DoWhileExample {
    public static void main(String[] args) {

        int a = 0;

        do{
            System.out.println(a);
            a++;
        } while (a <= 10);
        System.out.println("With False boolean");

        int a2 = 0;

         do{
             System.out.println(a2);
             a++;
         } while (a2 ==10);

        System.out.println("as while loop");

        int a3 = 0;

        while(a3 == 10);
        System.out.println(a3);
        a3++;

    }
}
