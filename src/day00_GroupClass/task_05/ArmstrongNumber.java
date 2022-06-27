package day00_GroupClass.task_05;

public class ArmstrongNumber {
    public static int mathQuarter(int number){
        return number*number*number*number;
    }
    public static int mathCube(int number){
        return number*number*number;
    }
    public static boolean Armstrong100To999(int x) {
        int a1 = x % 10;
        int b10 = x % 100 / 10;
        int c100 = x / 100;

        if (x >= 100) {
            if (mathCube(a1) + mathCube(b10) + mathCube(c100) == x) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    public static boolean Armstrong1000To9999(int x) {
        int a1 = x % 10;
        int b10 = x % 100 / 10;
        int c100 = x % 1000 / 100;
        int d1000 = x / 1000;

        if (x >= 100) {
            if (mathQuarter(a1) + mathQuarter(b10) + mathQuarter(c100) + mathQuarter(d1000)== x) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        for (int i = 100; i <= 999; i++) {
            if (Armstrong100To999(i)) {
                System.out.println("Armstrong number from 3 numbers: " + i);
            }
        }
        for (int i = 1000; i <= 9999; i++) {
            if(Armstrong1000To9999(i)){
                System.out.println("Armstrong number from 4 numbers: " + i);
            }

        }


    }
    public static boolean AmstNum(int x){
        int i = 0;
        int count = 0;

        while (x != 0){

            int temp = x % 10;



        }
        return true;
    }

}
