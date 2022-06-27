package day26_nested_loops;

public class NestedLoopExample {
    public static void main(String[] args) {



        for(int i = 0; i < 5; i++){
            System.out.println("Hello world 1");
        }
        for(int i = 0; i < 5; i++){
            System.out.println("Hello world 2\n");
        }
        System.out.println("Hello Universe 2");

        System.out.println("----------------");

        for(int j = 0; j < 3; j++){

            for(int i = 0; i < 5; i++) {
                System.out.println("Hello world 3");
            }
            System.out.println("Hello Universe 3\n");

        }

    }

}
