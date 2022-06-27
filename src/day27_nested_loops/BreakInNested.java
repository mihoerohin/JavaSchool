package day27_nested_loops;

public class BreakInNested {
    public static void main(String[] args) {

        for(int i = 0; i < 3; i++){

            System.out.println("i " + i);

            if(i == 3){
                break;
            }

            for (int j = 0; j < 5; j++){

                System.out.println("j " + j);
            }
            System.out.println();
        }


    }
}
