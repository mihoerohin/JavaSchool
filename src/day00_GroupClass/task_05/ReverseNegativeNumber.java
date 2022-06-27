package day00_GroupClass.task_05;

public class ReverseNegativeNumber {

    public static int ReverseNumNegative(int num){

        int reverse = 0;

            while (num != 0){
                int temp = num % 10;

                reverse = reverse * 10 + temp;
                num /= 10;
            }
        return reverse;
    }

    public static void main(String[] args) {

        System.out.println(ReverseNumNegative(-12345));







    }
}
