package day24_loops;

public class SwitchInloop {
    public static void main(String[] args) {

        for (int i = 0; i <=3; i++){

            switch (i) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                default:
                    System.out.println("???");
                    break;
            }
        }
    }
}
