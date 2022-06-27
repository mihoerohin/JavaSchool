package day00_GroupClass.task_05;

public class PrimeNumbers {

    public static boolean primeNum(int x){

        if(x == 1 || x == 0){
            return false;
        }

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println("primeNum(11) = " + primeNum(11));

        for (int i = 1; i < 100; i++) {
            if(primeNum(i)){
                System.out.println("Prime Numbers = " + i);
            }

        }

    }
}
