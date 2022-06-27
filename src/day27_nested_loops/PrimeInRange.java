package day27_nested_loops;

public class PrimeInRange {
    public static void main(String[] args) {

        int range = 500;

        for (int i = 2; i <= range; i++){

            int count = 0;

            for(int j = 2; j < i; j++){

                if(i % j == 0){
                    count++;
                }

            }
            if(count == 0){
                System.out.print(i + ", ");
            }
        }
    }
}
