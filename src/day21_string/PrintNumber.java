package day21_string;

public class PrintNumber {
    public static void main(String[] args) {

        int even = 2;
        int even2 = 1;

        while(even <= 100){
            System.out.println(even);
            even += 2;
        }
        System.out.println("\n2*************************************************");
        
        while(even2 <= 100) {

            if (even2 % 2 == 0) {
                System.out.print(even2 + " ");
            }
            even2++;

        }
        System.out.println("\n3*************************************************");
        

        int odd = 1;

        while (odd <= 100){
            System.out.print(odd + " ");
            odd += 2;
        }

        System.out.println("\n*************************************************");

        int b = 0;
        while (b++ <= 100){
            if (b % 2 == 0);
            System.out.print(b + " ");
        }


    }

}
