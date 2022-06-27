package day00_GroupClass.task_04;

public class DivideWithoutOperator {

    public static void main(String[] args) {


        otherDivide(20,2);
        otherDivide(15,5);


    }

    public static void otherDivide(int num1, int num2) {

        int x = num1;
        int counter = 0;

        if (num2 == 0) {
            System.out.println("Can not divide " + counter);
        }else {
            for (int i = 1; i <= x; i++) {
                if (num1 >= num2) {
                    num1 -= num2;
                    counter++;
                }else{
                    break;
                }
            }
            System.out.println(counter);
        }


    }

}
