package day29_Arrays;

public class EvenOrOdd {
    public static void main(String[] args) {


        int [] nums = {4, 1, 3, 12, 5, 13, 55, 22, 203, 34, 213, 2};
        int odd = 0;
        int even = 0;
        String oddNum = "";
        String evenNum = "";


        for(int i = 0; i < nums.length; i++){

            if(nums[i] % 2 == 0){
                even++;
                evenNum += nums[i] + " ";
            }else{
                odd++;
                oddNum += nums[i] + " ";
            }

        }
        System.out.println("Even counter: " + even);
        System.out.println("Even numbers: " + evenNum);
        System.out.println("Odd counter: " + odd);
        System.out.println("Odd numbers: " + oddNum);
        System.out.println();


        for(int number : nums) {

            if (number % 2 == 0) {
                even++;
                evenNum += number + " ";
            } else {
                odd++;
                oddNum += number + " ";
            }
        }
            System.out.println("2) Even counter: " + even);
            System.out.println("2) Even numbers: " + evenNum);
            System.out.println("2) Odd counter: " + odd);
            System.out.println("2) Odd numbers: " + oddNum);
            System.out.println();

    }

}
