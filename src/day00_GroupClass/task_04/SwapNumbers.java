package day00_GroupClass.task_04;

public class SwapNumbers {
    //For that one, the requirement is swap two numbers value. for example, a = 10, b = 20. you code should return a = 20, b = 10;

    public static void main(String[] args) {

        swapTwoNumbers(22,12); // --> 12 22
        swapTwoNumbers(1234, 9876);  // --> 9876 1234
    }

    public static void swapTwoNumbers(int num1, int num2){

        int sum = num1 + num2;

        System.out.println((sum - num1) + " " + (sum - num2));
    }
}
