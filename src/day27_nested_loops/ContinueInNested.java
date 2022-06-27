package day27_nested_loops;

public class ContinueInNested {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++){

            if(i == 0 || i == 1){     // miss 0 and 1 string
                continue;
            }

            System.out.println("i " + i);

            for (int j = 0; j < 6; j++){
                if(j == 1 || j == 4){       // miss 1 and 2 string
                    continue;
                }
                 // continue here is skipping the iteration when j is 1, so it does not get printed
                System.out.println("\tj " + j);

                for(int k = 0; k < 3; k++){
                    System.out.println("\t\tk " + k);
                }
            }

        }
    }
}
