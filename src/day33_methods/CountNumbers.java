package day33_methods;

public class CountNumbers {
    public static void count(int n){
        for (int i = 0; i <= n; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        count(20);
        count(66);
        count(43);

        count(-10);   // not working

    }


}
